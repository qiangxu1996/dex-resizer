package edu.purdue.dsnl.dexresizer;

import lanchon.multidexlib2.BasicDexFileNamer;
import lanchon.multidexlib2.DexIO;
import lanchon.multidexlib2.MultiDexIO;

import java.io.File;
import java.io.IOException;

public class DexResizer {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Usage: dex-resizer <in dex directory> <out dex directory>");
			System.exit(1);
		}

		try {
			var namer = new BasicDexFileNamer();
			var dex = MultiDexIO.readDexFile(true, new File(args[0]), namer, null, null);
			MultiDexIO.writeDexFile(true, new File(args[1]), namer, dex, DexIO.DEFAULT_MAX_DEX_POOL_SIZE / 2, null);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(2);
		}
	}
}
