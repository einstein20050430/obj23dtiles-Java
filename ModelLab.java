package com.mamt.obj2tileset;

import com.mamt.lm3d.Degree3;

/**
 * Hello world!
 *
 */
public class ModelLab {
	/**
	 * 设置或获取剔除模型名称（类型）关键字
	 */
	public static String[] discardKeys;

	public static void main(String[] args) {

		String fileName = "E:\\models\\obj\\cy_obj\\cy_obj.obj";
		String outPath = "E:\\models\\obj\\tiles\\";

		Model2Tileset tileset = new Model2Tileset();
		tileset.inFile = fileName;
		tileset.outPath = outPath;
		// 自定义模型层级
		LevelModel[] levels = getLevels(false);
		// 开始生成数据集
		Degree3 center = new Degree3(116.39086591, 39.91289358, 40.18, 0);
		tileset.startup(center, levels, discardKeys);
		System.out.println("Success!");
	}
}
