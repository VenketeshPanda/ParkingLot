package parkinglot.strategy;

import parkinglot.models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategy(SlotAssignmentStrategyType slotAssignmentStrategyType){
        if(slotAssignmentStrategyType==SlotAssignmentStrategyType.RANDOM){
            return new RandomSlotAssignmentStrategy();
        }
        return null;
    }
}
