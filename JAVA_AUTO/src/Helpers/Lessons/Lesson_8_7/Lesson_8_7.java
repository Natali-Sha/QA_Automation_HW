package Helpers.Lessons.Lesson_8_7;

public class Lesson_8_7 {
        public String first;
        public String last;

    public Lesson_8_7(String first, String last){
        this.first = first;
        this.last = last;
    }

    @Override
       public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lesson_8_7 other = (Lesson_8_7) obj;
        if (first != other.first)
            return false;
        if (last != other.last)
            return false;
        return true;
    }




    @Override
    public int hashCode() {
        int hash = 21;
        hash = 12 * hash + (first == null ? 0 : first.hashCode());
        hash = 12 * hash + (last == null ? 0 : last.hashCode());
        return hash;
    }

}
