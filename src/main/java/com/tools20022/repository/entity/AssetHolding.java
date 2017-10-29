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
import com.tools20022.repository.codeset.BlockedReasonCode;
import com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.codeset.UnrealisedCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies in terms of value and quantity the assets.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetHolding" src="doc-files/AssetHolding.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#HoldingValue
 * AssetHolding.HoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#BookValue
 * AssetHolding.BookValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#FaceAmount
 * AssetHolding.FaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#AmortisedFaceValue
 * AssetHolding.AmortisedFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#MarketValue
 * AssetHolding.MarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Balance
 * AssetHolding.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#UnrealisedGainOrLoss
 * AssetHolding.UnrealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Asset
 * AssetHolding.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Haircut
 * AssetHolding.Haircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#EligibleCollateralValue
 * AssetHolding.EligibleCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
 * AssetHolding.ExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#CapValue
 * AssetHolding.CapValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#RiskAdjustedValue
 * AssetHolding.RiskAdjustedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#RealisedGainOrLoss
 * AssetHolding.RealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#UnrealisedType
 * AssetHolding.UnrealisedType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#PostHaircutValue
 * AssetHolding.PostHaircutValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Interest
 * AssetHolding.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
 * AssetHolding.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#FinancialAssetType
 * AssetHolding.FinancialAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
 * AssetHolding.VariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
 * AssetHolding.IndependentAmountCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#HoldingType
 * AssetHolding.HoldingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#GuaranteeAmount
 * AssetHolding.GuaranteeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetValue
 * Asset.AssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#AssetHolding
 * Balance.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
 * Interest.RelatedAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
 * CurrencyExchange.CalculatedAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
 * Collateral.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
 * Collateral.VariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#AssetHolding
 * HaircutValuation.AssetHolding}</li>
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
 * "AssetHolding"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies in terms of value and quantity the assets."</li>
 * </ul>
 */
public class AssetHolding {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the balance of an individual securities holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the balance of an individual securities holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingValue";
			definition = "Value of the balance of an individual securities holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of a security, as booked/acquired in an account. Book value is
	 * often different from the current market value of the security.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BookValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the face amount, ie, the
	 * principal, of a debt instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#FaceAmount
	 * OriginalAndCurrentQuantities1.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#FaceAmount
	 * FinancialInstrumentQuantityChoice.FaceAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FaceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalAndCurrentQuantities1.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.FaceAmount);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the current amortised face
	 * amount of a bond, for example, a periodic reduction/increase of a bond's
	 * principal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#AmortisedValue
	 * OriginalAndCurrentQuantities1.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#AmortisedValue
	 * FinancialInstrumentQuantityChoice.AmortisedValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedFaceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmortisedFaceValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalAndCurrentQuantities1.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.AmortisedValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisedFaceValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding based on current market prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding based on current market prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketValue";
			definition = "Value of the asset holding based on current market prices.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the balance of the asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#AssetHolding
	 * Balance.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the balance of the asset holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Specifies the balance of the asset holding.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Difference between the holding value and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the holding value and the book value of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnrealisedGainOrLoss = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the asset included in the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#AssetValue
	 * Asset.AssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset included in the holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset included in the holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage by which an asset's market value is reduced for the purpose of
	 * calculating capital requirement, margin and collateral levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#AssetHolding
	 * HaircutValuation.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Haircut = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels.";
			minOccurs = 0;
			type_lazy = () -> HaircutValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of the position eligible for collateral purposes. This corresponds
	 * to the sub balance with a type AvailableForCollateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EligibleCollateralValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate between the currency of the asset and the
	 * reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
	 * CurrencyExchange.CalculatedAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#ExchangeRate
	 * CashCollateral5.ExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the asset and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral5.ExchangeRate);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the asset and the reporting currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum notional value for a financial instrument that is capped.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum notional value for a financial instrument that is capped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CapValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a financial instrument that is capped.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#CollateralValue
	 * CashCollateral5.CollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAdjustedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RiskAdjustedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral5.CollateralValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskAdjustedValue";
			definition = "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Difference between the realised value caused by the actual
	 * trade/re-evaluation and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RealisedGainOrLoss = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the unrealised amount is a gain or a loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnrealisedCode
	 * UnrealisedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the unrealised amount is a gain or a loss."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnrealisedType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedType";
			definition = "Specifies whether the unrealised amount is a gain or a loss.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnrealisedCode.mmObject();
		}
	};
	/**
	 * Value of the collateral after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this collateral.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostHaircutValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostHaircutValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * interest relative to the asset and the parameters used to calculate it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
	 * Interest.RelatedAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "interest relative to the asset and the parameters used to calculate it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "interest relative to the asset and the parameters used to calculate it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral information in relation with some assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
	 * Collateral.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with some assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral information in relation with some assets.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAssetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetType";
			definition = "Specifies the asset type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
	 * Collateral.VariationMarginAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
	 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IndependentAmountCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingType";
			definition = "Specifies the type of holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BlockedReasonCode.mmObject();
		}
	};
	/**
	 * Amount of the bank guarantee.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the bank guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GuaranteeAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetHolding";
				definition = "Specifies in terms of value and quantity the assets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Interest.RelatedAssetHolding,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.HaircutValuation.AssetHolding);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetHolding.HoldingValue, com.tools20022.repository.entity.AssetHolding.BookValue, com.tools20022.repository.entity.AssetHolding.FaceAmount,
						com.tools20022.repository.entity.AssetHolding.AmortisedFaceValue, com.tools20022.repository.entity.AssetHolding.MarketValue, com.tools20022.repository.entity.AssetHolding.Balance,
						com.tools20022.repository.entity.AssetHolding.UnrealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetHolding.Haircut,
						com.tools20022.repository.entity.AssetHolding.EligibleCollateralValue, com.tools20022.repository.entity.AssetHolding.ExchangeRate, com.tools20022.repository.entity.AssetHolding.CapValue,
						com.tools20022.repository.entity.AssetHolding.RiskAdjustedValue, com.tools20022.repository.entity.AssetHolding.RealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.UnrealisedType,
						com.tools20022.repository.entity.AssetHolding.PostHaircutValue, com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.FinancialAssetType, com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral,
						com.tools20022.repository.entity.AssetHolding.HoldingType, com.tools20022.repository.entity.AssetHolding.GuaranteeAmount);
			}
		});
		return mmObject_lazy.get();
	}
}