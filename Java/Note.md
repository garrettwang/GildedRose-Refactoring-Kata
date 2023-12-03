## How do i refactor the gilded rose kata ##

- At first, create a test with Approval Tests Library
- Because it is very obviously, there are different types of items.
My intention is put the logic in each type of item.
- And Polymorphism should be created
- So, i refactor the method updateQuality() with help of coverage from a lot of IF statement to a SWITCH statement
- Because it is not allowed to change the class Item, i have to build my inheritance independent on Item.
- So i encapsulate the Item in a new Class CleanItem
- And the CleanItem has some subclasses and each of them has a specific logic of its kind of item
