# ≽(◕ ᴗ ◕)≼
# -AXOLOTL-

### Proof of concept for SpringBoot + Glassfish


Proof of concept for a SpringBoot Application working in Glassfish 4.1.2

#### Endpoints

* "/" root shows a random axolotl picture between two possible ones.

**Example**
```http request
GET http://localhost:8080/axolotl/
```
<img src="https://i.imgur.com/JHl9Nef.jpg" alt="drawing" width="350"/>

* "/greeting" takes a "name" paramaeter and displays a greeting. 
Additionally it counts the number of times the endpoint has been called since the start of the application.

**Example**:
```http request
GET http://localhost:8080/axolotl/greeting?name=Darkona
```
```json
{
  "id": 3,
  "message": "Hello Darkona! I'm Axolotl!"
}
```


### Changes

* 1.0.0 Initial version

##### Build with Maven

mvn clean package spring-boot:repackage

