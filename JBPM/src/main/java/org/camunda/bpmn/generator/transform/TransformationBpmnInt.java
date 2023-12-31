package org.camunda.bpmn.generator.transform;

import org.camunda.bpmn.generator.process.BpmnDiagramTransport;
import org.camunda.bpmn.generator.report.Report;

public interface TransformationBpmnInt {

  String getName();

  /**
   * before any operation, the transformer get an initialiation method.
   * Object is the same: all initialization variable will be accesible during execution
   *
   * @return
   */
  boolean init(Report report);

  /**
   * Apply a transformation
   *
   * @param diagram progress to transform
   * @return the diagram transformed
   */
  BpmnDiagramTransport apply(BpmnDiagramTransport diagram, Report report);

  String getReportOperations();

}
