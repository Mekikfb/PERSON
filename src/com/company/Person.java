package com.company;

class person {
    private String name;
    private String description;

    public void setName(String name) {
        this.name = name;
    }
//ВАСЯ ЕЛ ГУСЯ
    @Override
    public String toString() {
        int i = 0;i++;
            return ", name: "+ name+", description: "+ description+"];";

    }
    public person(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
