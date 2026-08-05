import { useState } from 'react'
import { Route,Routes } from 'react-router-dom'
import {Header,Footer, Home, About, Contact,User, GitHub} from './components/index.js'


function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <Header/>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/about' element={<About/>}/>
        <Route path='/contact' element={<Contact/>}/>
        <Route path='/user/:userId' element={<User/>}  />
        <Route path='/github' element={<GitHub/>}/>
        <Route path='/github/:username' element={<GitHub/>}/>
      </Routes>
      <Footer/>
    </div>
  )
}

export default App
