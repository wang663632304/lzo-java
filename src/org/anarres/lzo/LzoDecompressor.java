/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.lzo;

/**
 *
 * @author shevek
 */
public interface LzoDecompressor extends LzoConstants {

    public int decompress(byte[] in, int in_base, int in_len,
            byte[] out, int out_base, lzo_uintp out_len);
}