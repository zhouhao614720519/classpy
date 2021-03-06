package com.github.zxh.classpy.classfile.constant;

import com.github.zxh.classpy.classfile.reader.ClassReader;
import com.github.zxh.classpy.classfile.datatype.U2;

/*
CONSTANT_Class_info {
    u1 tag;
    u2 name_index;
}
*/
public class ConstantClassInfo extends ConstantInfo {

    private U2 nameIndex;

    public U2 getNameIndex() {
        return nameIndex;
    }

    @Override
    protected void readInfo(ClassReader reader) {
        nameIndex = reader.readU2();
    }

    @Override
    protected String loadDesc(ConstantPool pool) {
        return pool.getUtf8String(nameIndex);
    }
    
}
