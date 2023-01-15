# Discrete Event Simulation
Code for the lecture Discrete Event Simulation.

```plantuml
@startuml
skinparam linetype ortho
hide empty description
state "Waits the in queue of counter 1" as Counter_1_queue
state "Wait the in queue of counter 2" as Counter_2_queue
state "Wait in the queue of the self service area" as SelfServiceArea_queue
state "Received food at counter 1" as Counter_1
state "Received food at counter 2" as Counter_2
state "Selected and took food from the self service area" as SelfServiceArea
state "Wait in payment queue" as Payment_desk_queue
state "Payed" as Payment_desk_1

[*] --> Counter_1_queue: if wants menu 1 (60%)
[*] --> Counter_2_queue: if wants menu 2 (25%)
[*] --> SelfServiceArea_queue: if wants snack (15% probability)

Counter_1_queue --> Counter_1
Counter_2_queue --> Counter_2
SelfServiceArea_queue --> SelfServiceArea

Counter_1: Got menu 1 served. (Mean serving time is 9.9626 with
Counter_1: standard deviation of 9.9526, serving time for menu 1
Counter_1: follows the exponential distribution)
Counter_2: Got menu 2 served. (Mean serving time is 9.9526,
Counter_2: the serving time for menu 2 follows the normal distribution.)
Counter_2:
SelfServiceArea: Selected & took food. Takes 3-20 seconds uniform distributed.
SelfServiceArea: 
SelfServiceArea: 

Counter_1 --> Payment_desk_queue
Counter_2 --> Payment_desk_queue
SelfServiceArea --> Payment_desk_queue

Payment_desk_queue --> Payment_desk_1

Payment_desk_1: Payed using either cash (15%) or card (85%).
Payment_desk_1: Card: Takes 3-15 seconds, follows uniform distribution.
Payment_desk_1: Cash: Takes 10-60 seconds, follows uniform distribution.

Payment_desk_1 --> [*]

@enduml
```
```plantuml
[*] --> Automaton: Entry
Automaton: Sell coffee and softdrinks
Automaton --> [*]: Customer leaves system
```
