public class BooleanOperations {
    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperations(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public Boolean getFirstOne() {
        return firstOne;
    }

    public void setFirstOne(Boolean firstOne) {
        this.firstOne = firstOne;
    }

    public Boolean getSecondOne() {
        return secondOne;
    }

    public void setSecondOne(Boolean secondOne) {
        this.secondOne = secondOne;
    }

    public Boolean conjunction() {
        if(checkNotNull(firstOne) || checkNotNull(secondOne)) return null;
        return firstOne && secondOne;
    }

    public Boolean disjunction() {
        if(checkNotNull(firstOne)) return secondOne;
        if(checkNotNull(secondOne)) return firstOne;
        return firstOne || secondOne;
    }

    private Boolean checkNotNull(Object obj) {
        return obj == null ? true : false;
    }
}
