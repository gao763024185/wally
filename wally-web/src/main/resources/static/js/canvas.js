/**
 * Created by gaobh on 2017/2/15.
 */

var container;
var camera, scene, projector, renderer;
var PI2 = Math.PI * 2;
var width = document.getElementById('gaobh').clientWidth;
var height= document.getElementById('main').clientHeight;
var programFill = function ( context ) {
    context.beginPath();
    context.arc( 0, 0, 1, 0, PI2, true );
    context.closePath();
    context.fill();
};
var programStroke = function ( context ) {
    context.lineWidth = 0.02;
    context.beginPath();
    context.arc( 0, 0, 1, 0, PI2, true );
    context.closePath();
    context.stroke();
};
var mouse = { x: 0, y: 0 }, INTERSECTED;
init();
animate();
function init() {
    container = document.createElement( 'div' );
    container.id = 'bgc';
    container.style.position = 'relative';
    container.style.zIndex = '0';
    document.body.appendChild( container );
    camera = new THREE.PerspectiveCamera( 50, width / height, 1, 10000 );
    camera.position.set( 0, 0, 0 );
    scene = new THREE.Scene();
    for ( var i = 0; i < 100; i ++ ) {
        var particle = new THREE.Particle( new THREE.ParticleCanvasMaterial( { color: Math.random() * 0x808080 + 0x808080, program: programStroke } ) );
        particle.position.x = Math.random() * 800 - 400;
        particle.position.y = Math.random() * 800 - 400;
        particle.position.z = Math.random() * 800 - 400;
        particle.scale.x = particle.scale.y = Math.random() * 10 + 10;
        scene.add( particle );
    }
    projector = new THREE.Projector();
    renderer = new THREE.CanvasRenderer();
    renderer.setSize( width, height );
    container.appendChild( renderer.domElement );
    document.addEventListener( 'mousemove', onDocumentMouseMove, false );
    window.addEventListener( 'resize', onWindowResize, false );
}
function onWindowResize() {
    camera.aspect = width / height;
    camera.updateProjectionMatrix();
    renderer.setSize( width, height );
}
function onDocumentMouseMove( event ) {
    event.preventDefault();
    mouse.x = ( event.clientX / width ) * 2 - 1;
    mouse.y = - ( event.clientY / height ) * 2 + 1;
}
function animate() {
    requestAnimationFrame( animate );
    render();
}
var radius = 600;
var theta = 0;
function render() {
    // rotate camera
    theta += 0.2;
    camera.position.x = radius * Math.sin( theta * Math.PI / 720 );
    camera.position.y = radius * Math.sin( theta * Math.PI / 720 );
    camera.position.z = radius * Math.cos( theta * Math.PI / 720 );
    camera.lookAt( scene.position );
    // find intersections
    camera.updateMatrixWorld();
    var vector = new THREE.Vector3( mouse.x, mouse.y, 0.5 );
    projector.unprojectVector( vector, camera );
    var ray = new THREE.Ray( camera.position, vector.subSelf( camera.position ).normalize() );
    var intersects = ray.intersectObjects( scene.children );
    if ( intersects.length > 0 ) {
        if ( INTERSECTED != intersects[ 0 ].object ) {
            if ( INTERSECTED ) INTERSECTED.material.program = programStroke;
            INTERSECTED = intersects[ 0 ].object;
            INTERSECTED.material.program = programFill;
        }
    } else {
        if ( INTERSECTED ) INTERSECTED.material.program = programStroke;
        INTERSECTED = null;
    }
    renderer.render( scene, camera );
}