
public interface IByteReader {
    int read(byte[] arr, int offset, int len);
    void close();
}
