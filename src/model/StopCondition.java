package model;

import desmoj.core.simulator.ModelCondition;
import desmoj.core.simulator.Queue;
import desmoj.core.simulator.TimeInstant;
import entities.Customer;

import java.util.Set;

public class StopCondition extends ModelCondition {
    private final TimeInstant stopTime;
    private final CafeteriaModel model;
    private final Set<Queue<Customer>> customerQueues;

    public StopCondition(CafeteriaModel model, TimeInstant stopTime) {
        super(model, StopCondition.class.getName(), true);
        this.model = model;
        this.stopTime = stopTime;
        this.customerQueues = Set.of(
                model.customerQueueSelfService,
                model.customersQueueCounter1,
                model.customersQueueCounter2,
                model.customerQueuePaymentShared
        );
    }

    @Override
    public boolean check() {
        boolean queuesEmpty = customerQueues.stream().allMatch(Queue::isEmpty);
        boolean timeAfterStopTime = TimeInstant.isAfterOrEqual(model.presentTime(), stopTime);
        // System.out.println("Queues empty? " + queuesEmpty);
        // System.out.println("Time over? " + timeAfterStopTime + " " + model.presentTime() + " " + stopTime);
        // customerQueues.forEach(queue -> {
        //     System.out.println(queue.getName() + " \t" + queue.size());
        // });
        return queuesEmpty && timeAfterStopTime;
    }
}
