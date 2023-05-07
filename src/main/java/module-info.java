module com.example.destinationbucketlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.destinationbucketlist to javafx.fxml;
    exports com.example.destinationbucketlist;
}