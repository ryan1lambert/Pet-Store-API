# Pet-Store-API

This API was built using spring boot.
Make sure that you have java and maven installed.

To run this project:
1. Download this repository
2. Go to the root of the project
3. Run the command mvn spring-boot:run(this was what the command was for me on macOS

or

1. In terms of IDE I used spring tool suite 4 which is based on eclipse. The project could be opened there and run inside the ide.

For testing out requests I used postman and I would navaigate to localhost:8080/pets then change the endpoint from there. I have only
populated the dataset with 3 entries to start. More can be added by calling the post request.

Example requests:
GET: localhost:8080/pets
--> the response to this request will be all entries in the dataset, in JSON format.

GET: localhost:8080/pets/0
--> the response to this request will be the pet with id = 0. To get other pets you can change the id in the endpoint.

GET: localhost:8080/pets/findByTags?tag=bad&tag=good
--> the response to this request will be a list of pets that have the tag good or bad, tags can be changed in endpoint to search for different results.

GET: localhost:8080/pets/findByStatus?status=available
--> the response to this request will be a list of pets whose status is available, status parameter can be changed in endpoint.

POST: localhost:8080/pets
--> make sure to change header so that key= Content-Type & value= application/json
--> the json data would be placed in the body. Here is a template for that:
    {
        "id": 0,
        "name": "name",
        "category": "category",
        "photoUrl": "photourl",
        "tags": [
            "tag1",
            "tag2"
        ],
        "status": "status"
    }
    
PUT: localhost:8080/pets/0
--> this would update the pet with id= 0
--> again make sure to change header key and value to the same as in post
--> use the json template given for post also to put the information in that you'd want to update the pet with

DELETE: localhost:8080/pets/0
--> this would delete the pet by id

POST: localhost:8080/0/uploadImage?img=imageurl
--> this would add an image url to a pet with id= 0
