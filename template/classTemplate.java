/*
* Autogenerated java file: ${definition.name}.java
* @date: ${date}
* @source: ${model.source.fileName}
* @copyright: ${copyright}
*/ 

// Package
package ${definition.package.name}; 

// Imports

// Class

/**
* Class definition for ${definition.name}
*/
public class ${definition.name} ${extends@optional(definition.superClass)} ${definition.superClass@optional} ${implements@optional(definition.interfaces)} ${interfaces@optional} {

// Attributes
${definition.attributes@iterate(attribute)}
    private ${model.attribute.type} ${model.attribute.name};
${end}
// Methods

${definition.methods@iterate(method)}
    private ${model.method.returnType} ${model.method.name} (${model.method.parameters}) {
        ${model.method.code}
    }
${end}
}