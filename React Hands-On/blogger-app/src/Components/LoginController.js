import React from 'react';
import Viewer from './Viewer';

class LoginControl extends React.Component {
  constructor(props) {
    super(props);
    this.handleBookClick = this.handleBookClick.bind(this);
    this.handleBlogClick = this.handleBlogClick.bind(this);
    this.handleCourseClick = this.handleCourseClick.bind(this);
    this.state = { isLoggedIn: "book" };
  }

  handleCourseClick() {
    this.setState({ isLoggedIn: "course" });
  }

  handleBookClick() {
    this.setState({ isLoggedIn: "book" });
  }

  handleBlogClick() {
    this.setState({ isLoggedIn: "blog" });
  }

  render() {
    const isLoggedIn = this.state.isLoggedIn;
    let button;

    if (isLoggedIn === "blog") {
      button = (
        <div className="div">
          <CourseButton onClick={this.handleCourseClick} />
          <BookButton onClick={this.handleBookClick} />
        </div>
      );
    } else if (isLoggedIn === "book") {
      button = (
        <div className="div">
          <CourseButton onClick={this.handleCourseClick} />
          <BlogButton onClick={this.handleBlogClick} />
        </div>
      );
    } else {
      button = (
        <div className="div">
          <BookButton onClick={this.handleBookClick} />
          <BlogButton onClick={this.handleBlogClick} />
        </div>
      );
    }

    return (
      <div>
        {button}
        <Viewer isLoggedIn={isLoggedIn} />
      </div>
    );
  }
}

function BookButton(props) {
  return <button onClick={props.onClick}>Book</button>;
}

function BlogButton(props) {
  return <button onClick={props.onClick}>Blog</button>;
}

function CourseButton(props) {
  return <button onClick={props.onClick}>Course</button>;
}

  export default LoginControl;