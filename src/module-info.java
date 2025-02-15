module HW2_Project {
    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;
    
    exports hw2;
    opens hw2 to org.junit.platform.commons;
} 