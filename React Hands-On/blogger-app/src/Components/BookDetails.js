
function BookDetails(props) {
    var books = [
      { id: 1001, name: "Master Angular", price: 800 },
      { id: 1002, name: "React MadeEasy", price: 900 },
      { id: 1003, name: "Java Proffesors Choice", price: 750 }
    ];
    return (
      <div>
        <h1>Book Details</h1>
        <Book books={books} />
      </div>
    );
  }
  function Book(props) {
    return props.books.map((book) => {
      return (
        <div>
        <b>{book.name}</b>
        <p>{book.price}</p>
      </div>
    );
  });
}
export default BookDetails;