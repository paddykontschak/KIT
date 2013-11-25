public enum Gender {
  MALE(1), FEMALE(2);
  
  Gender(int gender) {
    this.gender = gender;
  }
  
  private int gender;
  
  public int getGender() {
      return gender;
  }
}