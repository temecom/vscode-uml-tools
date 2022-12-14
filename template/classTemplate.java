/*
 * Autogenerated java file: {{definition.name}}.java
 * 
 * @date: {{date}}
 * 
 * @source: {{model.source.fileName}}
 * 
 * @copyright: {{copyright}}
 * 
 * @uml {{definition.id}}
 */

package{{definition.package.name}};

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

{{#each definition.imports as|import|}}import{{import.package}}.{{import.name}};{{/each}}

/**
 * Class definition for {{definition.name}}
 * 
 * @uml {{definition.id}}
 */
@Getter @Setter @AccessLevel(chained=true)public class{{definition.name}}{{#if definition.superClass}}extends{{definition.superClass}}{{/if}}{{#if definition.interfaces}}implements{{definition.interfaces}}{{/if}}{

{{#each definition.attributes as|attribute|}}
/**
 * {{attribute.name}}
 * 
 * @uml {{attribute.id}}
 */
private{{attribute.type}}{{attribute.name}};{{/each}}

{{#each definition.methods as|method|}}

/**
 * {{method.name}}
 * 
 * {{#each method.parameters as |parameter|}}
 * 
 * @param {{parameter.name}} {{parameter.type}}
 *                           {{/each}}
 * @returns {{method.type}}
 * @uml {{method.id}}
 */
public{{method.type}}{{method.name}}({{#each method.parameters as|parameter|}}{{#if @index}},{{/if}}{{parameter.type}}{{parameter.name}}{{/each}}){{{method.code}}}{{/each}}}