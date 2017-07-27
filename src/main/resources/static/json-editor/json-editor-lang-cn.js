/**
 * json-editor
 * Created by goofy on 2016/11/8.
 */
JSONEditor.defaults.languages.cn = {
    error_notset: "必须设置属性值",
    /**
     * When a string must not be empty
     */
    error_notempty: "该字段不能为空",
    /**
     * When a value is not one of the enumerated values
     */
    error_enum: "必须选择枚举值",
    /**
     * When a value doesn't validate any schema of a 'anyOf' combination
     */
    error_anyOf: "Value must validate against at least one of the provided schemas",
    /**
     * When a value doesn't validate
     * @variables This key takes one variable: The number of schemas the value does not validate
     */
    error_oneOf: 'Value must validate against exactly one of the provided schemas. It currently validates against {{0}} of the schemas.',
    /**
     * When a value does not validate a 'not' schema
     */
    error_not: "Value must not validate against the provided schema",
    /**
     * When a value does not match any of the provided types
     */
    error_type_union: "Value must be one of the provided types",
    /**
     * When a value does not match the given type
     * @variables This key takes one variable: The type the value should be of
     */
    error_type: "值必须是 {{0}} 类型",
    /**
     *  When the value validates one of the disallowed types
     */
    error_disallow_union: "Value must not be one of the provided disallowed types",
    /**
     *  When the value validates a disallowed type
     * @variables This key takes one variable: The type the value should not be of
     */
    error_disallow: "Value must not be of type {{0}}",
    /**
     * When a value is not a multiple of or divisible by a given number
     * @variables This key takes one variable: The number mentioned above
     */
    error_multipleOf: "Value must be a multiple of {{0}}",
    /**
     * When a value is greater than it's supposed to be (exclusive)
     * @variables This key takes one variable: The maximum
     */
    error_maximum_excl: "必须小于 {{0}}",
    /**
     * When a value is greater than it's supposed to be (inclusive
     * @variables This key takes one variable: The maximum
     */
    error_maximum_incl: "不能大于 {{0}}",
    /**
     * When a value is lesser than it's supposed to be (exclusive)
     * @variables This key takes one variable: The minimum
     */
    error_minimum_excl: "必须大于 {{0}}",
    /**
     * When a value is lesser than it's supposed to be (inclusive)
     * @variables This key takes one variable: The minimum
     */
    error_minimum_incl: "不能小于 {{0}}",
    /**
     * When a value have too many characters
     * @variables This key takes one variable: The maximum character count
     */
    error_maxLength: "最多 {{0}} 个字符",
    /**
     * When a value does not have enough characters
     * @variables This key takes one variable: The minimum character count
     */
    error_minLength: "最少 {{0}} 个字符!",
    /**
     * When a value does not match a given pattern
     */
    error_pattern: "必须符合正则 {{0}}",
    /**
     * When an array has additional items whereas it is not supposed to
     */
    error_additionalItems: "不允许添加项目",
    /**
     * When there are to many items in an array
     * @variables This key takes one variable: The maximum item count
     */
    error_maxItems: "最多添加 {{0}} 项",
    /**
     * When there are not enough items in an array
     * @variables This key takes one variable: The minimum item count
     */
    error_minItems: "至少需要 {{0}} 项",
    /**
     * When an array is supposed to have unique items but has duplicates
     */
    error_uniqueItems: "不能有重复项",
    /**
     * When there are too many properties in an object
     * @variables This key takes one variable: The maximum property count
     */
    error_maxProperties: "最多 {{0}} 个属性",
    /**
     * When there are not enough properties in an object
     * @variables This key takes one variable: The minimum property count
     */
    error_minProperties: "至少 {{0}} 个属性",
    /**
     * When a required property is not defined
     * @variables This key takes one variable: The name of the missing property
     */
    error_required: "属性 '{{0}}' 必填",
    /**
     * When there is an additional property is set whereas there should be none
     * @variables This key takes one variable: The name of the additional property
     */
    error_additional_properties: "不能添加额外的属性, 但 {{0}} 被设置",
    /**
     * When a dependency is not resolved
     * @variables This key takes one variable: The name of the missing property for the dependency
     */
    error_dependency: "必须有 {{0}} 属性",
    /**
     * Text on Delete All buttons
     */
    button_delete_all: "全部",
    /**
     * Title on Delete All buttons
     */
    button_delete_all_title: "全部删除",
    /**
     * Text on Delete Last buttons
     * @variable This key takes one variable: The title of object to delete
     */
    button_delete_last: "删除最后一个 {{0}}",
    /**
     * Title on Delete Last buttons
     * @variable This key takes one variable: The title of object to delete
     */
    button_delete_last_title: "删除最后一个 {{0}}",
    /**
     * Title on Add Row buttons
     * @variable This key takes one variable: The title of object to add
     */
    button_add_row_title: "添加 {{0}}",
    /**
     * Title on Move Down buttons
     */
    button_move_down_title: "下移",
    /**
     * Title on Move Up buttons
     */
    button_move_up_title: "上移",
    /**
     * Title on Delete Row buttons
     * @variable This key takes one variable: The title of object to delete
     */
    button_delete_row_title: "删除 {{0}}",
    /**
     * Title on Delete Row buttons, short version (no parameter with the object title)
     */
    button_delete_row_title_short: "删除",
    /**
     * Title on Collapse buttons
     */
    button_collapse: "收起",
    /**
     * Title on Expand buttons
     */
    button_expand: "展开",
    /**
     * Title on Upload buttons
     */
    button_upload: "上传",
    /**
     * Text in Edit Json buttons
     */
    button_edit_json: "编辑 JSON",
    /**
     * Title in Edit Json buttons
     */
    button_edit_json_title: "编辑 JSON"
};
