let namastebutton = document.querySelector('button');
// namastebutton.addEventListener('click', showMSG);
namastebutton.addEventListener('click', inputMSG);
function showMSG(){
    alert('NAMASTE JavaScrpit LOVER');
}
function inputMSG(){
    let name = prompt( 'Please enter your Name' );
    namastebutton.textContent='muchas gracias '+name;
}