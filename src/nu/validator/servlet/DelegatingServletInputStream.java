/*
 * Copyright (c) 2007 Mozilla Foundation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package nu.validator.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletInputStream;

public final class DelegatingServletInputStream extends ServletInputStream {

    private final InputStream delegate;

    public DelegatingServletInputStream(InputStream delegate) {
        this.delegate = delegate;
    }

    /**
     * @return
     * @throws IOException
     * @see java.io.InputStream#available()
     */
    public int available() throws IOException {
        return delegate.available();
    }

    /**
     * @throws IOException
     * @see java.io.InputStream#close()
     */
    public void close() throws IOException {
        delegate.close();
    }

    /**
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }

    /**
     * @return
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return delegate.hashCode();
    }

    /**
     * @param readlimit
     * @see java.io.InputStream#mark(int)
     */
    public void mark(int readlimit) {
        delegate.mark(readlimit);
    }

    /**
     * @return
     * @see java.io.InputStream#markSupported()
     */
    public boolean markSupported() {
        return delegate.markSupported();
    }

    /**
     * @return
     * @throws IOException
     * @see java.io.InputStream#read()
     */
    public int read() throws IOException {
        return delegate.read();
    }

    /**
     * @param b
     * @param off
     * @param len
     * @return
     * @throws IOException
     * @see java.io.InputStream#read(byte[], int, int)
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return delegate.read(b, off, len);
    }

    /**
     * @param b
     * @return
     * @throws IOException
     * @see java.io.InputStream#read(byte[])
     */
    public int read(byte[] b) throws IOException {
        return delegate.read(b);
    }

    /**
     * @throws IOException
     * @see java.io.InputStream#reset()
     */
    public void reset() throws IOException {
        delegate.reset();
    }

    /**
     * @param n
     * @return
     * @throws IOException
     * @see java.io.InputStream#skip(long)
     */
    public long skip(long n) throws IOException {
        return delegate.skip(n);
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return delegate.toString();
    }

}
