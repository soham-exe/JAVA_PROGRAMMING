# Program1:
| Sr. No. | Input Code (`main` method) | Output |
| :---: | :--- | :--- |
| 1 | `int[] arr1 = {85, 66, 3, 90, 93, 88};`<br>`lobj.Check(arr1, 6, 90);` | `Number is present` |
| 2 | `int[] arr2 = {10, 20, 30, 40, 5};`<br>`lobj.Check(arr2, 5, 25);` | `Number is not present` |
| 3 | `int[] arr3 = {5, 7, 9, 11, 2};`<br>`lobj.Check(arr3, 5, 5);` | `Number is present` |
| 4 | `int[] arr4 = {5, 7, 9, 11, 2};`<br>`lobj.Check(arr4, 5, 2);` | `Number is present` |
| 5 | `int[] arr5 = {7, 7, 7};`<br>`lobj.Check(arr5, 3, 7);` | `Number is present` |
| 6 | `int[] arr6 = {};`<br>`lobj.Check(arr6, 0, 5);` | `Number is not present` |

# Program2:
| Sr. No. | Input Code (`main` method) | Output |
| :---: | :--- | :--- |
| 1 | `int[] arr1 = {85, 66, 3, 66, 93, 88};`<br>`lobj.FirstOcc(arr1, 6, 66);` | `index is 1` |
| 2 | `int[] arr2 = {10, 20, 30, 40, 5};`<br>`lobj.FirstOcc(arr2, 5, 10);` | `index is 0` |
| 3 | `int[] arr3 = {5, 7, 9, 11, 2};`<br>`lobj.FirstOcc(arr3, 5, 2);` | `index is 4` |
| 4 | `int[] arr4 = {5, 7, 9, 11, 2};`<br>`lobj.FirstOcc(arr4, 5, 8);` | `index is -1` |
| 5 | `int[] arr5 = {7, 7, 7};`<br>`lobj.FirstOcc(arr5, 3, 7);` | `index is 0` |
| 6 | `int[] arr6 = {};`<br>`lobj.FirstOcc(arr6, 0, 5);` | `index is -1` |

# Program3:
| Sr. No. | Input Code (`main` method) | Output |
| :---: | :--- | :--- |
| 1 | `int[] arr1 = {85, 66, 3, 66, 93, 88};`<br>`lobj.LastOcc(arr1, 6, 66);` | `Last occurrence of number is : 3` |
| 2 | `int[] arr2 = {10, 20, 30, 40, 5};`<br>`lobj.LastOcc(arr2, 5, 10);` | `Last occurrence of number is : 0` |
| 3 | `int[] arr3 = {5, 7, 9, 11, 2};`<br>`lobj.LastOcc(arr3, 5, 8);` | `There is no such number` |
| 4 | `int[] arr4 = {7, 7, 7, 7};`<br>`lobj.LastOcc(arr4, 4, 7);` | `Last occurrence of number is : 3` |
| 5 | `int[] arr5 = {10, 20, 10, 30, 10};`<br>`lobj.LastOcc(arr5, 5, 10);` | `Last occurrence of number is : 4` |
| 6 | `int[] arr6 = {};`<br>`lobj.LastOcc(arr6, 0, 5);` | `There is no such number` |

# Program4:
| Sr. No. | Input Code (`main` method) | Output |
| :---: | :--- | :--- |
| 1 | `int[] arr1 = {85, 66, 3, 90, 93, 88};`<br>`lobj.Range(arr1, 6, 60, 90);` | `85 66 90 88` |
| 2 | `int[] arr2 = {10, 20, 30, 40, 50};`<br>`lobj.Range(arr2, 5, 10, 30);` | `10 20 30` |
| 3 | `int[] arr3 = {10, 20, 30, 40, 50};`<br>`lobj.Range(arr3, 5, 100, 200);` | *(No output)* |
| 4 | `int[] arr4 = {5, 7, 5, 11, 2};`<br>`lobj.Range(arr4, 5, 5, 5);` | `5 5` |
| 5 | `int[] arr5 = {-10, 5, -2, 0, 8};`<br>`lobj.Range(arr5, 5, -5, 5);` | `5 -2 0` |
| 6 | `int[] arr6 = {};`<br>`lobj.Range(arr6, 0, 1, 10);` | *(No output)* |

# Program5:
| Sr. No. | Input Code (`main` method) | Output |
| :---: | :--- | :--- |
| 1 | `int[] arr1 = {15, 66, 3, 70, 10, 5};`<br>`lobj.Product(arr1, 6);` | `Product is : 225` |
| 2 | `int[] arr2 = {10, 20, 30, 40};`<br>`lobj.Product(arr2, 4);` | `Product is : 0` |
| 3 | `int[] arr3 = {1, 3, 5, 7};`<br>`lobj.Product(arr3, 4);` | `Product is : 105` |
| 4 | `int[] arr4 = {9, 2, 4};`<br>`lobj.Product(arr4, 3);` | `Product is : 9` |
| 5 | `int[] arr5 = {5, 0, 3, 2};`<br>`lobj.Product(arr5, 4);` | `Product is : 15` |
| 6 | `int[] arr6 = {};`<br>`lobj.Product(arr6, 0);` | `Product is : 0` |
