module com.example.destinationbucketlist {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.destinationbucketlist to javafx.fxml;
    exports com.example.destinationbucketlist;
}