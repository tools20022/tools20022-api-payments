/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BorrowingReasonCode;
import com.tools20022.repository.codeset.LendingTransactionMethodCode;
import com.tools20022.repository.codeset.ReversibleCode;
import com.tools20022.repository.codeset.SecuritiesLendingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Lending of securities by one party to another. The terms of the loan are
 * governed by an agreement that requires the borrower to provide the lender
 * with collateral of value equal to or greater than the loaned securities. As
 * payment for the loan, the parties negotiate a fee, quoted as an annualised
 * percentage of the value of the loaned securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesLending" src="doc-files/SecuritiesLending.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmBorrowingFee
 * SecuritiesLending.mmBorrowingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmCallableTradeIndicator
 * SecuritiesLending.mmCallableTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmLendingTransactionMethod
 * SecuritiesLending.mmLendingTransactionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmBorrowingReason
 * SecuritiesLending.mmBorrowingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmReversible
 * SecuritiesLending.mmReversible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmSecuritiesLendingType
 * SecuritiesLending.mmSecuritiesLendingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmLendingWithCollateral
 * SecuritiesLending.mmLendingWithCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmMinimumDateForCallBack
 * SecuritiesLending.mmMinimumDateForCallBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmNumberOfDaysLendingBorrowing
 * SecuritiesLending.mmNumberOfDaysLendingBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmPeriodicPayment
 * SecuritiesLending.mmPeriodicPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmRollover
 * SecuritiesLending.mmRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmBorrowingRate
 * SecuritiesLending.mmBorrowingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmSecuritiesDeliveryObligation
 * SecuritiesLending.mmSecuritiesDeliveryObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesLending
 * SecuritiesDeliveryObligation.mmSecuritiesLending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesLending"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Lending of securities by one party to another. The terms of the loan are governed by an agreement that requires the borrower to provide the lender with collateral of value equal to or greater than the loaned securities. As payment for the loan, the parties negotiate a fee, quoted as an annualised percentage of the value of the loaned securities."
 * </li>
 * </ul>
 */
public class SecuritiesLending extends SecuritiesFinancing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount borrowingFee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be paid by the borrower to the lender for the securities borrowed calculated based on the bond loan rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, CurrencyAndAmount> mmBorrowingFee = new MMBusinessAttribute<SecuritiesLending, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingFee";
			definition = "Amount to be paid by the borrower to the lender for the securities borrowed calculated based on the bond loan rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesLending obj) {
			return obj.getBorrowingFee();
		}

		@Override
		public void setValue(SecuritiesLending obj, CurrencyAndAmount value) {
			obj.setBorrowingFee(value);
		}
	};
	protected YesNoIndicator callableTradeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is callable or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, YesNoIndicator> mmCallableTradeIndicator = new MMBusinessAttribute<SecuritiesLending, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallableTradeIndicator";
			definition = "Indicates whether the trade is callable or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesLending obj) {
			return obj.getCallableTradeIndicator();
		}

		@Override
		public void setValue(SecuritiesLending obj, YesNoIndicator value) {
			obj.setCallableTradeIndicator(value);
		}
	};
	protected LendingTransactionMethodCode lendingTransactionMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode
	 * LendingTransactionMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingTransactionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method applied to a lending transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, LendingTransactionMethodCode> mmLendingTransactionMethod = new MMBusinessAttribute<SecuritiesLending, LendingTransactionMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Method applied to a lending transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LendingTransactionMethodCode.mmObject();
		}

		@Override
		public LendingTransactionMethodCode getValue(SecuritiesLending obj) {
			return obj.getLendingTransactionMethod();
		}

		@Override
		public void setValue(SecuritiesLending obj, LendingTransactionMethodCode value) {
			obj.setLendingTransactionMethod(value);
		}
	};
	protected BorrowingReasonCode borrowingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
	 * BorrowingReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, BorrowingReasonCode> mmBorrowingReason = new MMBusinessAttribute<SecuritiesLending, BorrowingReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingReason";
			definition = "Underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BorrowingReasonCode.mmObject();
		}

		@Override
		public BorrowingReasonCode getValue(SecuritiesLending obj) {
			return obj.getBorrowingReason();
		}

		@Override
		public void setValue(SecuritiesLending obj, BorrowingReasonCode value) {
			obj.setBorrowingReason(value);
		}
	};
	protected ReversibleCode reversible;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReversibleCode
	 * ReversibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, ReversibleCode> mmReversible = new MMBusinessAttribute<SecuritiesLending, ReversibleCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reversible";
			definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReversibleCode.mmObject();
		}

		@Override
		public ReversibleCode getValue(SecuritiesLending obj) {
			return obj.getReversible();
		}

		@Override
		public void setValue(SecuritiesLending obj, ReversibleCode value) {
			obj.setReversible(value);
		}
	};
	protected SecuritiesLendingTypeCode securitiesLendingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
	 * SecuritiesLendingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of securities lending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, SecuritiesLendingTypeCode> mmSecuritiesLendingType = new MMBusinessAttribute<SecuritiesLending, SecuritiesLendingTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLendingType";
			definition = "Type of securities lending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesLendingTypeCode.mmObject();
		}

		@Override
		public SecuritiesLendingTypeCode getValue(SecuritiesLending obj) {
			return obj.getSecuritiesLendingType();
		}

		@Override
		public void setValue(SecuritiesLending obj, SecuritiesLendingTypeCode value) {
			obj.setSecuritiesLendingType(value);
		}
	};
	protected YesNoIndicator lendingWithCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingWithCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the contract is with or without an exchange of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, YesNoIndicator> mmLendingWithCollateral = new MMBusinessAttribute<SecuritiesLending, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LendingWithCollateral";
			definition = "Indicates if the contract is with or without an exchange of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesLending obj) {
			return obj.getLendingWithCollateral();
		}

		@Override
		public void setValue(SecuritiesLending obj, YesNoIndicator value) {
			obj.setLendingWithCollateral(value);
		}
	};
	protected ISODate minimumDateForCallBack;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDateForCallBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum date at which the borrower is allowed to give back the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, ISODate> mmMinimumDateForCallBack = new MMBusinessAttribute<SecuritiesLending, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDateForCallBack";
			definition = "Minimum date at which the borrower is allowed to give back the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SecuritiesLending obj) {
			return obj.getMinimumDateForCallBack();
		}

		@Override
		public void setValue(SecuritiesLending obj, ISODate value) {
			obj.setMinimumDateForCallBack(value);
		}
	};
	protected Max4NumericText numberOfDaysLendingBorrowing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4NumericText
	 * Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysLendingBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days the securities are lent or borrowed for a contract which has an agreed closing date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, Max4NumericText> mmNumberOfDaysLendingBorrowing = new MMBusinessAttribute<SecuritiesLending, Max4NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfDaysLendingBorrowing";
			definition = "Number of days the securities are lent or borrowed for a contract which has an agreed closing date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}

		@Override
		public Max4NumericText getValue(SecuritiesLending obj) {
			return obj.getNumberOfDaysLendingBorrowing();
		}

		@Override
		public void setValue(SecuritiesLending obj, Max4NumericText value) {
			obj.setNumberOfDaysLendingBorrowing(value);
		}
	};
	protected YesNoIndicator periodicPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the securities lending fees can be paid periodically or at the end of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, YesNoIndicator> mmPeriodicPayment = new MMBusinessAttribute<SecuritiesLending, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodicPayment";
			definition = "Indicates whether the securities lending fees can be paid periodically or at the end of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesLending obj) {
			return obj.getPeriodicPayment();
		}

		@Override
		public void setValue(SecuritiesLending obj, YesNoIndicator value) {
			obj.setPeriodicPayment(value);
		}
	};
	protected YesNoIndicator rollover;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the contract can be rolled over."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, YesNoIndicator> mmRollover = new MMBusinessAttribute<SecuritiesLending, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Indicates that the contract can be rolled over.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesLending obj) {
			return obj.getRollover();
		}

		@Override
		public void setValue(SecuritiesLending obj, YesNoIndicator value) {
			obj.setRollover(value);
		}
	};
	protected PercentageRate borrowingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate paid by the borrower to the lender for the securities borrowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesLending, PercentageRate> mmBorrowingRate = new MMBusinessAttribute<SecuritiesLending, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingRate";
			definition = "Rate paid by the borrower to the lender for the securities borrowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesLending obj) {
			return obj.getBorrowingRate();
		}

		@Override
		public void setValue(SecuritiesLending obj, PercentageRate value) {
			obj.setBorrowingRate(value);
		}
	};
	protected SecuritiesDeliveryObligation securitiesDeliveryObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesLending
	 * SecuritiesDeliveryObligation.mmSecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation covered by the lending of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesLending, com.tools20022.repository.entity.SecuritiesDeliveryObligation> mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd<SecuritiesLending, com.tools20022.repository.entity.SecuritiesDeliveryObligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation covered by the lending of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesLending;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesDeliveryObligation getValue(SecuritiesLending obj) {
			return obj.getSecuritiesDeliveryObligation();
		}

		@Override
		public void setValue(SecuritiesLending obj, com.tools20022.repository.entity.SecuritiesDeliveryObligation value) {
			obj.setSecuritiesDeliveryObligation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLending";
				definition = "Lending of securities by one party to another. The terms of the loan are governed by an agreement that requires the borrower to provide the lender with collateral of value equal to or greater than the loaned securities. As payment for the loan, the parties negotiate a fee, quoted as an annualised percentage of the value of the loaned securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesLending);
				superType_lazy = () -> SecuritiesFinancing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesLending.mmBorrowingFee, com.tools20022.repository.entity.SecuritiesLending.mmCallableTradeIndicator,
						com.tools20022.repository.entity.SecuritiesLending.mmLendingTransactionMethod, com.tools20022.repository.entity.SecuritiesLending.mmBorrowingReason, com.tools20022.repository.entity.SecuritiesLending.mmReversible,
						com.tools20022.repository.entity.SecuritiesLending.mmSecuritiesLendingType, com.tools20022.repository.entity.SecuritiesLending.mmLendingWithCollateral,
						com.tools20022.repository.entity.SecuritiesLending.mmMinimumDateForCallBack, com.tools20022.repository.entity.SecuritiesLending.mmNumberOfDaysLendingBorrowing,
						com.tools20022.repository.entity.SecuritiesLending.mmPeriodicPayment, com.tools20022.repository.entity.SecuritiesLending.mmRollover, com.tools20022.repository.entity.SecuritiesLending.mmBorrowingRate,
						com.tools20022.repository.entity.SecuritiesLending.mmSecuritiesDeliveryObligation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesLending.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getBorrowingFee() {
		return borrowingFee;
	}

	public SecuritiesLending setBorrowingFee(CurrencyAndAmount borrowingFee) {
		this.borrowingFee = Objects.requireNonNull(borrowingFee);
		return this;
	}

	public YesNoIndicator getCallableTradeIndicator() {
		return callableTradeIndicator;
	}

	public SecuritiesLending setCallableTradeIndicator(YesNoIndicator callableTradeIndicator) {
		this.callableTradeIndicator = Objects.requireNonNull(callableTradeIndicator);
		return this;
	}

	public LendingTransactionMethodCode getLendingTransactionMethod() {
		return lendingTransactionMethod;
	}

	public SecuritiesLending setLendingTransactionMethod(LendingTransactionMethodCode lendingTransactionMethod) {
		this.lendingTransactionMethod = Objects.requireNonNull(lendingTransactionMethod);
		return this;
	}

	public BorrowingReasonCode getBorrowingReason() {
		return borrowingReason;
	}

	public SecuritiesLending setBorrowingReason(BorrowingReasonCode borrowingReason) {
		this.borrowingReason = Objects.requireNonNull(borrowingReason);
		return this;
	}

	public ReversibleCode getReversible() {
		return reversible;
	}

	public SecuritiesLending setReversible(ReversibleCode reversible) {
		this.reversible = Objects.requireNonNull(reversible);
		return this;
	}

	public SecuritiesLendingTypeCode getSecuritiesLendingType() {
		return securitiesLendingType;
	}

	public SecuritiesLending setSecuritiesLendingType(SecuritiesLendingTypeCode securitiesLendingType) {
		this.securitiesLendingType = Objects.requireNonNull(securitiesLendingType);
		return this;
	}

	public YesNoIndicator getLendingWithCollateral() {
		return lendingWithCollateral;
	}

	public SecuritiesLending setLendingWithCollateral(YesNoIndicator lendingWithCollateral) {
		this.lendingWithCollateral = Objects.requireNonNull(lendingWithCollateral);
		return this;
	}

	public ISODate getMinimumDateForCallBack() {
		return minimumDateForCallBack;
	}

	public SecuritiesLending setMinimumDateForCallBack(ISODate minimumDateForCallBack) {
		this.minimumDateForCallBack = Objects.requireNonNull(minimumDateForCallBack);
		return this;
	}

	public Max4NumericText getNumberOfDaysLendingBorrowing() {
		return numberOfDaysLendingBorrowing;
	}

	public SecuritiesLending setNumberOfDaysLendingBorrowing(Max4NumericText numberOfDaysLendingBorrowing) {
		this.numberOfDaysLendingBorrowing = Objects.requireNonNull(numberOfDaysLendingBorrowing);
		return this;
	}

	public YesNoIndicator getPeriodicPayment() {
		return periodicPayment;
	}

	public SecuritiesLending setPeriodicPayment(YesNoIndicator periodicPayment) {
		this.periodicPayment = Objects.requireNonNull(periodicPayment);
		return this;
	}

	public YesNoIndicator getRollover() {
		return rollover;
	}

	public SecuritiesLending setRollover(YesNoIndicator rollover) {
		this.rollover = Objects.requireNonNull(rollover);
		return this;
	}

	public PercentageRate getBorrowingRate() {
		return borrowingRate;
	}

	public SecuritiesLending setBorrowingRate(PercentageRate borrowingRate) {
		this.borrowingRate = Objects.requireNonNull(borrowingRate);
		return this;
	}

	public SecuritiesDeliveryObligation getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public SecuritiesLending setSecuritiesDeliveryObligation(com.tools20022.repository.entity.SecuritiesDeliveryObligation securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = Objects.requireNonNull(securitiesDeliveryObligation);
		return this;
	}
}