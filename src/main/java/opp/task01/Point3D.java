package opp.task01;

class Point3D extends Point2D {

  private float z;

  public Point3D(float x, float y, float z) {
    super(x, y);
    this.z = z;
  }

  public Point3D() {
    this(0, 0, 0);
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public float[] getXYZ() {
    return new float[]{getX(), getY(), getZ()};
  }

  public void setXYZ(float x, float y, float z) {
    setXY(x, y);
    setZ(z);
  }

  @Override
  public String toString() {
    return String.format("(%.2f, %.2f, %.2f)", getX(), getY(), getZ());
  }

}
