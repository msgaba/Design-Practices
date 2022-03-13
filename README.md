# Design-Practices
Sample project with some standard practices which should be followed while designing app.
## Sample screenshots
![Screenshot_20220313-231142](https://user-images.githubusercontent.com/71500144/158072190-83bd38ff-257d-4dca-9e4e-81bc0c1c5004.jpg)
![Screenshot_20220313-231149](https://user-images.githubusercontent.com/71500144/158072195-e6ef31f9-6cbf-4b95-9a73-bef91dae3fde.jpg)
![Screenshot_20220313-231155](https://user-images.githubusercontent.com/71500144/158072202-ef058c4b-4635-4727-9671-1376c0d6f854.jpg)
![Screenshot_20220313-231202](https://user-images.githubusercontent.com/71500144/158072209-730caf44-3258-4fc2-8395-7fc10646a838.jpg)
## Concepts Used
- Used View binding
- Used kotlin extension function for managing visibility of views which makes code more readable.
- Created a class "Base Fragment" consisting a piece of static code required to create a class.
- Instead of using hard coded string in xmls and classes, strings added in "strings.xml" and used via getString() method.
- Instead of using hard coded dimension values in xmls, added dimensions in "dimen.xml" and thereafter used.
- Instead of using color codes directly in xmls, added colors in "colors.xml" and thereafter used.
- Depicting back button functionality when more than one fragments are used in a activity.
- Used variables to manage view in order to avoid writing repetitive code.
## Design
Design is kept minimalistic and simple. All images used are svg files downloaded online from different sources.
## Objective
Objective of this was just to depict standard practices which should be used while designing app in kotlin using View binding



