function BlogDetails(props) {
    var blogs = [
      {
        id: 1001,
        name: "Angular Learning",
        author: "Verappan",
        desc: "Welcome to our Blog"
      },
      {
        id: 1002,
        name: "Learning React",
        author: "Daavud Ibrahim",
        desc: "Free Installation guide for React. Please like, subscribe, share"
      }
    ];
    return (
      <div>
        <h1>Blog Details</h1>
        <Blog blogs={blogs} />
      </div>
    );
  }
  function Blog(props) {
    return props.blogs.map((blog) => {
      return (
        <div>
        <h2>{blog.name}</h2>
        <b>{blog.author}</b>
        <p>{blog.desc}</p>
      </div>
    );
  });
}
export default BlogDetails;