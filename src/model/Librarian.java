package model;

public class Librarian {
int id;
String callno;
String name;
String author;
String Publisher;
int quantity;
int issued;
String added_date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCallno() {
	return callno;
}
public void setCallno(String callno) {
	this.callno = callno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return Publisher;
}
public void setPublisher(String publisher) {
	Publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}
public String getAdded_date() {
	return added_date;
}
public void setAdded_date(String added_date) {
	this.added_date = added_date;
}


}
