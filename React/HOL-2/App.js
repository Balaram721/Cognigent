import Home from "./Home";
import About from "./About"
import Contact from "./Contact"
import "./App.css";

function App(){
  return(
    <div className="main">
      <Home/>
      <About/>
      <Contact/>
    </div>
  );
}

export default App;