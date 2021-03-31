import BlogDetails from './BlogDetails';
import BookDetails from './BookDetails';
import CourseDetails from './CourseDetails';


function Viewer(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn === "book") {
      return <BookDetails />;
    } else if (isLoggedIn === "blog") {
      return <BlogDetails />;
    } else {
      return <CourseDetails />;
    }
  }

  export default Viewer;
  