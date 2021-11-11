package task2;

import java.io.IOException;
import java.util.Objects;

public class TryWithResources implements AutoCloseable {
    private String file;

    public TryWithResources(final String file){
        this.file = file;
    }
    public String getFile() {
        return file;
    }

    public void setFile(final String file) {
        this.file = file;
    }

    public void read() throws IOException {

            throw new IOException();
    }

    @Override
    public void close()  {
        System.out.println("closed");
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TryWithResources that = (TryWithResources) o;
        return Objects.equals(file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        return
                "file ='" + file + '\'';
    }
}

