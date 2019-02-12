This project is a Maven project , It was developed using Spring MVC framework
The main entry point is calling the service AvailableHotels by sending the mandatory request parameters :

http://localhost:8080/HotelBooking/AvailableHotel/?fromDate=2019-01-01&toDate=2019-02-01&city=AUH&numberOfAdults=2


The service will aggregate results from all hotels providers , currently there are two providers as per the requierments.

By default running the service will return an empty list as it is expecting data from provider's API , 
I have created a mock content to enable it do the following:

- Navigate to CrazyHotelServiceCallerImpl.java  located under com.sakkijha.hotel.services.impl package
- Uncomment line 28 from CrazyHotelServiceCallerImpl and comment out line 29
- Navigate to BestHotelServiceCallerImpl.java located under com.sakkijha.hotel.services.impl package
- Uncomment line 30 from CrazyHotelServiceCallerImpl and comment out line 31
- compile and build project
- call the URL above again


The result will be aggregated from both providers and will be sorted in an order according to the rating.

