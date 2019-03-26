package com.crossoverjie.algorithm;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;


public class LinkedListMergeSortTest {

  @Rule public Timeout globalTimeout = new Timeout(10000);

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();

    // Method returns void, testing that no exception is thrown
  }

  // Test generated by Diffblue Cover.
  @Test
  public void mergeListNotNull() {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node left = new LinkedListMergeSort.Node(-2_147_483_647, null);
    final LinkedListMergeSort.Node right = new LinkedListMergeSort.Node(0, null);

    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeList(left, right);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(0, retval.e);
    Assert.assertNotNull(retval.next);
    Assert.assertEquals(-2_147_483_647, retval.next.e);
    Assert.assertNull(retval.next.next);
  }

  // Test generated by Diffblue Cover.
  @Test
  public void mergeListInputNotNullNotNullOutputNotNull2() {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node left = new LinkedListMergeSort.Node(1, null);
    final LinkedListMergeSort.Node right = new LinkedListMergeSort.Node(-2_147_483_648, null);

    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeList(left, right);


    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(1, retval.e);
    Assert.assertNotNull(retval.next);
    Assert.assertEquals(-2_147_483_648, retval.next.e);
    Assert.assertNull(retval.next.next);
  }


  @Test
  public void mergeListInputRightNull()  {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node left = new LinkedListMergeSort.Node(-2_147_483_647,null);
    final LinkedListMergeSort.Node right = null;


    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeList(left, right);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(-2_147_483_647, retval.e);
    Assert.assertNull(retval.next);
  }


  @Test
  public void mergeListInputLeftNull()  {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node left = null;
    final LinkedListMergeSort.Node right = new LinkedListMergeSort.Node(0, null);


    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeList(left, right);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(0, retval.e);
    Assert.assertNull(retval.next);
  }


  @Test
  public void mergeListInputNull() {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node left = null;
    final LinkedListMergeSort.Node right = null;

    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeList(left, right);

    // Assert result
    Assert.assertNull(retval);
  }

  @Test
  public void mergeSortLength2() {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node node =  new LinkedListMergeSort.Node(-0, null);
    final LinkedListMergeSort.Node first = new LinkedListMergeSort.Node(-2_147_483_647, node);

    final int length = 2;

    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeSort(first, length);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(0, retval.e);
    Assert.assertNotNull(retval.next);
    Assert.assertEquals(-2_147_483_647, retval.next.e);
    Assert.assertNull(retval.next.next);
  }

  @Test
  public void mergeSortInputNull() {

    // Arrange
    final LinkedListMergeSort objectUnderTest = new LinkedListMergeSort();
    final LinkedListMergeSort.Node first = null;
    final int length = 1;

    // Act
    final LinkedListMergeSort.Node retval = objectUnderTest.mergeSort(first, length);

    // Assert result
    Assert.assertNull(retval);
  }
  @Test
  public void mainInput0OutputVoid() throws Exception {

    // Arrange
    final String[] args = {};

    // Act
    LinkedListMergeSort.main(args);

    // Method returns void, testing that no exception is thrown
  }

}