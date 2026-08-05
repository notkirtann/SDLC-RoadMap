function customRender(reactElement, container){
    /*
    const domElement = document.createElement(reactElement.type)
    domElement.innerHTML = reactElement.children
    domElement.setAttribute('href', reactElement.props.href)
    domElement.setAttribute('target', reactElement.props.target)

    container.appendChild(domElement)
    */
   //yaha agar multiple children hote toh zada function likhne pdte so neeche hum loops based code likhenge jo better option hoga iterate krne k liyeee

    const domElement = document.createElement(reactElement.type)
    domElement.innerHTML = reactElement.children
    for (const prop in reactElement.props) {
        if (prop === 'children') continue;
        domElement.setAttribute(prop, reactElement.props[prop])
    }
    container.appendChild(domElement)
}

const reactElement = {
    type: 'a',
    props: {
        href: 'https://kirtan-nahar.vercel.app/',
        target: '_blank'
    },
    children: 'Click me to visit portfolio'
}

const mainContainer = document.querySelector('#root')

customRender(reactElement, mainContainer)