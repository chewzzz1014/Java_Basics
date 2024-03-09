package com.example.bealdung.equalhashcode;

public class Team {

    String city;
    String department;

    @Override
    public final boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Team)) return false;

        Team other = (Team) o;

        boolean cityEquals = (this.city == null && other.city == null) || (this.city != null && this.city.equals(other.city));

        boolean departmentEquals = (this.department == null && other.department == null) || (this.department != null && this.department.equals(other.department));

        return cityEquals && departmentEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if (city != null) {
            result = 31 * result + city.hashCode();
        }
        if (department != null) {
            result = 31 * result + department.hashCode();
        }
        return result;
    }
}
