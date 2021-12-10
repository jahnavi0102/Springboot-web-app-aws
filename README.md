#Locally

    # Process :
        Clone the project using `-git clone` ..
        Dependency - `sudo apt-get install maven`
        Connect with your local database : postgres if possible (configure in `application.properties`)
        Run : `mvn spring-boot:run`
    
    # Url endpoints  :
        get  : localhost:8080/
                 **Method: Gets the list of Employees**
        post : localhost:8080/saveEmployee
                 **Method: Post one Employee**
        get  : localhost:8080/updateEmployee/2
                 **Method: Update the Employee of particular id**
        get  : localhost:8080/deleteEmployee/2
                 **Method: Update the Employee of particular id** 

#Server 

    #Url endpoints: 
        get  : http://13.58.35.238:8080/
                 **Method: Gets the list of Employees**
        post : http://13.58.35.238:8080/saveEmployee
                 **Method: Post one Employee**
        get  : http://13.58.35.238:8080/updateEmployee/2
                 **Method: Update the Employee of particular id**
        get  : http://13.58.35.238:8080/deleteEmployee/2
                 **Method: Update the Employee of particular id  

#Steps to load on a server(No templates use postman)

    #Create ec2 instance 
    #Save pem file and start connecting the server 
          ssh -i "file_name.pem" "ubuntu:ip"
    #Save your project in the server 
    #Start the project manually using the `mvn spring-boot:run`


#Other possiblities 
    
    Dcokerize it .
    Create CI/CD to manually update the code (using aws services like code build , code deploy, code pipeline)

