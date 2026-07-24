import React from "react";
import "./App.css";

import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";

function App() {

    const show = true;

    return (
        <div className="container">

            {show && <CourseDetails />}

            {show ? <BookDetails /> : null}

            {show ? <BlogDetails /> : null}

        </div>
    );
}

export default App;