# threeMusketeers
Donia Tung, Manahal Tabassum, Brian Kwong

## Design
Our HelpDesk revolves around a priority queue. When the newTicket() method is called, the user is prompted for their name and to choose from one of 4 avaliable services (Reinstall OS, Disbatch tech support, Reset Password, and Moral Support & Hugs). A priority  is assigned to each of the services, with Reinstall OS being the highest priority and Moral Support & Hugs the lowest priority (unfortunately). Once all the information is filled out, a new ticket is then added to the priority queue, which places them in priority order during the enqueue() operation. If two tickets are of the same priority, then the ticket submitted first will be solved first when dequeue() is called.

## Ticket
A ticket consists of a ticket number (starting from 1), the name of the person who submitted the ticket, the priority number the ticket has (1-4) and the description of the problem as specified in the HelpDesk class. 

## Embellishments
An extra feature we gave to the user was to specify their new password when solving a Reset Password ticket.
