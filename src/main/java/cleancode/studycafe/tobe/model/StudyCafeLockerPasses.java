package cleancode.studycafe.tobe.model;

import java.util.List;

public class StudyCafeLockerPasses {

    private final List<StudyCafeLockerPass> lockerPasses;

    private StudyCafeLockerPasses(List<StudyCafeLockerPass> passes) {
        this.lockerPasses = passes;
    }

    public static StudyCafeLockerPasses of(List<StudyCafeLockerPass> lockerPasses) {
        return new StudyCafeLockerPasses(lockerPasses);
    }

    public StudyCafeLockerPass findLockerPassBy(StudyCafePass pass) {
        return lockerPasses.stream()
                .filter(pass::isSameDurationType)
                .findFirst()
                .orElse(null);
    }
}


