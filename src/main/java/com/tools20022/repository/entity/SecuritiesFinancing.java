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
import com.tools20022.repository.codeset.RepurchaseTypeCode;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process of lending or borrowing cash or securities against securities or cash
 * collateral. It aims at optimising liquidity, support a trading strategy, or
 * increase settlement efficiency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesFinancing" src="doc-files/SecuritiesFinancing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
 * SecuritiesFinancing.mmReturnLegInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmType
 * SecuritiesFinancing.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
 * SecuritiesFinancing.mmTerminationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
 * SecuritiesFinancing.mmRateChangeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
 * SecuritiesFinancing.mmRevaluationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
 * SecuritiesFinancing.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
 * SecuritiesFinancing.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
 * SecuritiesFinancing.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
 * SecuritiesFinancing.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
 * SecuritiesFinancing.mmRepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
 * SecuritiesFinancing.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancing.mmTotalNumberOfCollateralInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmDealAmount
 * SecuritiesFinancing.mmDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmForfeitRepurchaseAmount
 * SecuritiesFinancing.mmForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmPremiumAmount
 * SecuritiesFinancing.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationAmountPerPieceOfCollateral
 * SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
 * SecuritiesFinancing.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEarliestCallBackDate
 * SecuritiesFinancing.mmEarliestCallBackDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementDate
 * SecuritiesFinancing.mmOpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
 * SecuritiesFinancing.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
 * SecuritiesFinancing.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmSpreadTransaction
 * SecuritiesFinancing.mmSpreadTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
 * SecuritiesFinancing.mmFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementAmount
 * SecuritiesFinancing.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRelatedIndicationOfInterest
 * SecuritiesFinancing.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmIdentification
 * SecuritiesFinancing.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
 * Spread.mmSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmSecuritiesFinancingTrade
 * SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesLending
 * SecuritiesLending}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency."
 * </li>
 * </ul>
 */
public class SecuritiesFinancing extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator returnLegInstruction;
	/**
	 * Specifies whether, for a securities lending/borrowing settlement
	 * transaction, the lender will instruct the return leg as agreed with the
	 * borrower.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLegInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReturnLegInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnLegInstruction";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getReturnLegInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransactionTypeV2Code type;
	/**
	 * Specifies the type of securities financing transaction, that is,
	 * repurchase agreement, reverse repurchase agreement, securities lending or
	 * securities borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime terminationDateTime;
	/**
	 * Closing date/time or maturity date/time of the repo transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the repo transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationDateTime";
			definition = "Closing date/time or maturity date/time of the repo transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getTerminationDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime rateChangeDateTime;
	/**
	 * Date/Time at which rate change has taken place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateChangeDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateChangeDateTime";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getRateChangeDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator revaluationIndicator;
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevaluationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRevaluationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevaluationIndicator";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getRevaluationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator interestPayment;
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestPayment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getInterestPayment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVariableRateSupport = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getVariableRateSupport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate repurchaseRate;
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRepurchaseRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getRepurchaseRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate stockLoanMargin;
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStockLoanMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getStockLoanMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest to be paid on the transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
	 * Interest.mmSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest to be paid on the transaction amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest to be paid on the transaction amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesFinancing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Spread repurchaseSpread;
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
	 * Spread.mmSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRepurchaseSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmSecuritiesFinancing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected Max3NumericText transactionCallDelay;
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionCallDelay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getTransactionCallDelay", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3NumericText totalNumberOfCollateralInstructions;
	/**
	 * Indicates the total Number of collateral instructions involved in the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfCollateralInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total Number of collateral instructions involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfCollateralInstructions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getTotalNumberOfCollateralInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount dealAmount;
	/**
	 * Deal amount of the second leg.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount of the second leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealAmount";
			definition = "Deal amount of the second leg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getDealAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount forfeitRepurchaseAmount;
	/**
	 * Fixed amount which has to be paid (instead of interest) in the case of a
	 * recall.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount which has to be paid (instead of interest) in the case of a recall."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForfeitRepurchaseAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Fixed amount which has to be paid (instead of interest) in the case of a recall.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getForfeitRepurchaseAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount premiumAmount;
	/**
	 * Difference between the cash amount of the first leg and the cash amount
	 * of the second leg of the repurchase agreement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getPremiumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount terminationAmountPerPieceOfCollateral;
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPieceOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationAmountPerPieceOfCollateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getTerminationAmountPerPieceOfCollateral", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationTransactionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getTerminationTransactionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator maturityDateModification;
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaturityDateModification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getMaturityDateModification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime earliestCallBackDate;
	/**
	 * Earliest date/time at which the call back can take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestCallBackDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date/time at which the call back can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEarliestCallBackDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getEarliestCallBackDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime openingSettlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getOpeningSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepurchaseTypeCode repurchaseType;
	/**
	 * Specifies the type of repurchase transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of repurchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRepurchaseType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies the type of repurchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepurchaseTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getRepurchaseType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> endPrice;
	/**
	 * Negotiated fixed price of the security to buy it back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
	 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiated fixed price of the security to buy it back."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEndPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndPrice";
			definition = "Negotiated fixed price of the security to buy it back.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected YesNoIndicator spreadTransaction;
	/**
	 * Specifies that there will be one price and one transaction when two
	 * contracts are carried out simultaneously, one to buy and the other one to
	 * sell with two different expiration dates.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSpreadTransaction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getSpreadTransaction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesFinancingAgreement financingAgreement;
	/**
	 * Provides the contractual details related to the agreement between
	 * parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmSecuritiesFinancingTrade
	 * SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the contractual details related to the agreement between parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinancingAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides the contractual details related to the agreement between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmObject();
		}
	};
	protected CurrencyAndAmount openingSettlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningSettlementAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getOpeningSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTrade closingLegExecution;
	/**
	 * Repayment of the previously received cash by one party in exchange of the
	 * return of the security by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
	 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClosingLegExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingLegExecution";
			definition = "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTrade.mmSecuritiesFinancingClosingData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	protected SecuritiesTrade openingLegExecution;
	/**
	 * Transfer of cash to a party against the legal transfer of securities. The
	 * cash receiver agrees to buy the same security from the counterparty at a
	 * fixed price at some later date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
	 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOpeningLegExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningLegExecution";
			definition = "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTrade.mmSecuritiesFinancingOpeningData;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * Indication of interest process which is the source of a securities
	 * financing process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
	 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process which is the source of a securities financing process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process which is the source of a securities financing process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmTwoLegTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique identification of the repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancing.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancing";
				definition = "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing, SecuritiesTrade.mmSecuritiesFinancingClosingData,
						SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.Interest.mmSecuritiesFinancing, com.tools20022.repository.entity.Spread.mmSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmTwoLegTransaction);
				subType_lazy = () -> Arrays.asList(SecuritiesLending.mmObject(), RepurchaseAgreement.mmObject());
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.mmReturnLegInstruction, com.tools20022.repository.entity.SecuritiesFinancing.mmType,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationDateTime, com.tools20022.repository.entity.SecuritiesFinancing.mmRateChangeDateTime,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRevaluationIndicator, com.tools20022.repository.entity.SecuritiesFinancing.mmInterestPayment,
						com.tools20022.repository.entity.SecuritiesFinancing.mmVariableRateSupport, com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseRate,
						com.tools20022.repository.entity.SecuritiesFinancing.mmStockLoanMargin, com.tools20022.repository.entity.SecuritiesFinancing.mmInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseSpread,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTransactionCallDelay, com.tools20022.repository.entity.SecuritiesFinancing.mmTotalNumberOfCollateralInstructions,
						com.tools20022.repository.entity.SecuritiesFinancing.mmDealAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmForfeitRepurchaseAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.mmPremiumAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationTransactionAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmMaturityDateModification,
						com.tools20022.repository.entity.SecuritiesFinancing.mmEarliestCallBackDate, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningSettlementDate,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseType, com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice, com.tools20022.repository.entity.SecuritiesFinancing.mmSpreadTransaction,
						com.tools20022.repository.entity.SecuritiesFinancing.mmFinancingAgreement, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningSettlementAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getReturnLegInstruction() {
		return returnLegInstruction;
	}

	public void setReturnLegInstruction(YesNoIndicator returnLegInstruction) {
		this.returnLegInstruction = returnLegInstruction;
	}

	public SecuritiesTransactionTypeV2Code getType() {
		return type;
	}

	public void setType(SecuritiesTransactionTypeV2Code type) {
		this.type = type;
	}

	public ISODateTime getTerminationDateTime() {
		return terminationDateTime;
	}

	public void setTerminationDateTime(ISODateTime terminationDateTime) {
		this.terminationDateTime = terminationDateTime;
	}

	public ISODateTime getRateChangeDateTime() {
		return rateChangeDateTime;
	}

	public void setRateChangeDateTime(ISODateTime rateChangeDateTime) {
		this.rateChangeDateTime = rateChangeDateTime;
	}

	public YesNoIndicator getRevaluationIndicator() {
		return revaluationIndicator;
	}

	public void setRevaluationIndicator(YesNoIndicator revaluationIndicator) {
		this.revaluationIndicator = revaluationIndicator;
	}

	public YesNoIndicator getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
	}

	public Max35Text getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(Max35Text variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	public PercentageRate getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(PercentageRate repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	public PercentageRate getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(PercentageRate stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public Spread getRepurchaseSpread() {
		return repurchaseSpread;
	}

	public void setRepurchaseSpread(com.tools20022.repository.entity.Spread repurchaseSpread) {
		this.repurchaseSpread = repurchaseSpread;
	}

	public Max3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Max3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	public Max3NumericText getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(Max3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
	}

	public CurrencyAndAmount getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(CurrencyAndAmount dealAmount) {
		this.dealAmount = dealAmount;
	}

	public CurrencyAndAmount getForfeitRepurchaseAmount() {
		return forfeitRepurchaseAmount;
	}

	public void setForfeitRepurchaseAmount(CurrencyAndAmount forfeitRepurchaseAmount) {
		this.forfeitRepurchaseAmount = forfeitRepurchaseAmount;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(CurrencyAndAmount premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public CurrencyAndAmount getTerminationAmountPerPieceOfCollateral() {
		return terminationAmountPerPieceOfCollateral;
	}

	public void setTerminationAmountPerPieceOfCollateral(CurrencyAndAmount terminationAmountPerPieceOfCollateral) {
		this.terminationAmountPerPieceOfCollateral = terminationAmountPerPieceOfCollateral;
	}

	public CurrencyAndAmount getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(CurrencyAndAmount terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}

	public YesNoIndicator getMaturityDateModification() {
		return maturityDateModification;
	}

	public void setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
	}

	public ISODateTime getEarliestCallBackDate() {
		return earliestCallBackDate;
	}

	public void setEarliestCallBackDate(ISODateTime earliestCallBackDate) {
		this.earliestCallBackDate = earliestCallBackDate;
	}

	public ISODateTime getOpeningSettlementDate() {
		return openingSettlementDate;
	}

	public void setOpeningSettlementDate(ISODateTime openingSettlementDate) {
		this.openingSettlementDate = openingSettlementDate;
	}

	public RepurchaseTypeCode getRepurchaseType() {
		return repurchaseType;
	}

	public void setRepurchaseType(RepurchaseTypeCode repurchaseType) {
		this.repurchaseType = repurchaseType;
	}

	public List<SecuritiesPricing> getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(List<com.tools20022.repository.entity.SecuritiesPricing> endPrice) {
		this.endPrice = endPrice;
	}

	public YesNoIndicator getSpreadTransaction() {
		return spreadTransaction;
	}

	public void setSpreadTransaction(YesNoIndicator spreadTransaction) {
		this.spreadTransaction = spreadTransaction;
	}

	public SecuritiesFinancingAgreement getFinancingAgreement() {
		return financingAgreement;
	}

	public void setFinancingAgreement(com.tools20022.repository.entity.SecuritiesFinancingAgreement financingAgreement) {
		this.financingAgreement = financingAgreement;
	}

	public CurrencyAndAmount getOpeningSettlementAmount() {
		return openingSettlementAmount;
	}

	public void setOpeningSettlementAmount(CurrencyAndAmount openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
	}

	public SecuritiesTrade getClosingLegExecution() {
		return closingLegExecution;
	}

	public void setClosingLegExecution(SecuritiesTrade closingLegExecution) {
		this.closingLegExecution = closingLegExecution;
	}

	public SecuritiesTrade getOpeningLegExecution() {
		return openingLegExecution;
	}

	public void setOpeningLegExecution(SecuritiesTrade openingLegExecution) {
		this.openingLegExecution = openingLegExecution;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}