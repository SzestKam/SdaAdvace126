package opp.task04;

record Point2D(float x, float y) {

  @Override
  public String toString() {
    return String.format("(%.2f, %.2f)", x, y);
  }
}
