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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode;
import com.tools20022.repository.codeset.ShareRankingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of the securities proceeds for a corporate action in generic
 * terms; that is, before applying it to specific securities holding. An example
 * would be the definition of a bonus rights issue where all the information
 * will be given in general on a per share basis.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesProceedsDefinition"
 * src="doc-files/SecuritiesProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
 * SecuritiesProceedsDefinition.StatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ParallelTradingPeriod
 * SecuritiesProceedsDefinition.ParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * AdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewToOld
 * SecuritiesProceedsDefinition.NewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ReinvestmentAmount
 * SecuritiesProceedsDefinition.ReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesDistributionType
 * SecuritiesProceedsDefinition.IntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ReinvestmentDiscountToMarket
 * SecuritiesProceedsDefinition.ReinvestmentDiscountToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#RedemptionDate
 * SecuritiesProceedsDefinition.RedemptionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AssentedLinePeriod
 * SecuritiesProceedsDefinition.AssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SellThruIssuerPeriod
 * SecuritiesProceedsDefinition.SellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ShareRanking
 * SecuritiesProceedsDefinition.ShareRanking}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ParallelTradingProceedsDefinition
 * DateTimePeriod.ParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssentedLinePeriodProceedsDefinition
 * DateTimePeriod.AssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SellThruIssuerProceedsDefinition
 * DateTimePeriod.SellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToOldProceedsDefinition
 * QuantityRatio.NewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToUnderlyingProceedsDefinition
 * QuantityRatio.NewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#IntermediateSecuritiesProceedsDefinition
 * QuantityRatio.IntermediateSecuritiesProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
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
 * "SecuritiesProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis."
 * </li>
 * </ul>
 */
public class SecuritiesProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * The quantity of financial instruments that is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
	 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The quantity of financial instruments that is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "The quantity of financial instruments that is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities to be accepted (used in the framework of
	 * conditional privilege on election). In case of proration, if this minimum
	 * quantity is not reached then the instruction is void.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
	 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConditionalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity instructed to be received over and above normal ensured
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
	 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveNormalEnsuredEntitlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed to be received over and above normal ensured entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OverAndAboveNormalEnsuredEntitlementQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveNormalEnsuredEntitlementQuantity";
			definition = "Quantity instructed to be received over and above normal ensured entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of the benefits that the account owner wants to receive, for
	 * example, as a result of dividend reinvestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
	 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuantityToReceive = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of securities that has been assigned the status indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
	 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that has been assigned the status indicated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StatusQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusQuantity";
			definition = "Quantity of securities that has been assigned the status indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * eg, consolidation of equity or splitting of equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ParallelTradingProceedsDefinition
	 * DateTimePeriod.ParallelTradingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ParallelTradingPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForResultantSecuritiesProceedsDefinition
	 * QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForSubscribedResultantSecurities = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of additional securities for a given quantity of underlying
	 * securities where underlying securities are not exchanged or debited, eg,
	 * 1 for 1: 1 new equity credited for every 1 underlying equity = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
	 * QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForExistingSecurities = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of new securities for a given quantity of underlying securities,
	 * where the underlying securities will be exchanged or debited, eg, 2 for
	 * 1: 2 new equities credited for every 1 underlying equity debited = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToOldProceedsDefinition
	 * QuantityRatio.NewToOldProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewToOld = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToUnderlyingProceedsDefinition
	 * QuantityRatio.NewToUnderlyingProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesToUnderlyingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewSecuritiesToUnderlyingSecurities = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money reinvested in additional securities.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money reinvested in additional securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Type of intermediate securities distribution, eg, stock dividend, reverse
	 * right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
	 * IntermediateSecurityDistributionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of intermediate securities distribution, eg, stock dividend, reverse right."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IntermediateSecuritiesDistributionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediate securities distribution, eg, stock dividend, reverse right.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
		}
	};
	/**
	 * Quantity of equity that makes up a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
	 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLotSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of equity that makes up a board lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BoardLotSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up a board lot.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * New denomination of the financial instrument following, eg, an increase
	 * or decrease in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
	 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New denomination of the financial instrument following, eg, an increase or decrease in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New denomination of the financial instrument following, eg, an increase or decrease in nominal value.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of intermediate securities awarded for a given quantity of
	 * underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#IntermediateSecuritiesProceedsDefinition
	 * QuantityRatio.IntermediateSecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesToUnderlyingRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of intermediate securities awarded for a given quantity of underlying security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateSecuritiesToUnderlyingRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesToUnderlyingRatio";
			definition = "Quantity of intermediate securities awarded for a given quantity of underlying security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate of discount for securities purchased through a reinvestment scheme
	 * as compared to the current market price of security.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDiscountToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentDiscountToMarket = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDiscountToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date on which the securities will be redeemed (early) for payment of
	 * principal.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the securities will be redeemed (early) for payment of principal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RedemptionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionDate";
			definition = "Date on which the securities will be redeemed (early) for payment of principal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during which the assented line is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#AssentedLinePeriodProceedsDefinition
	 * DateTimePeriod.AssentedLinePeriodProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the assented line is available."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssentedLinePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period (last day included) during which an account owner can surrender or
	 * sell securities to the issuer and receive the sale proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SellThruIssuerProceedsDefinition
	 * DateTimePeriod.SellThruIssuerProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellThruIssuerPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SellThruIssuerPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the shares are ranking for dividend or pari passu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRankingCode
	 * ShareRankingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareRanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the shares are ranking for dividend or pari passu."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShareRanking = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShareRanking";
			definition = "Specifies whether the shares are ranking for dividend or pari passu.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ShareRankingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesProceedsDefinition";
				definition = "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentAmount,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesDistributionType, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentDiscountToMarket, com.tools20022.repository.entity.SecuritiesProceedsDefinition.RedemptionDate,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ShareRanking);
			}
		});
		return mmObject_lazy.get();
	}
}