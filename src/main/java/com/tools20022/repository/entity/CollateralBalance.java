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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralInterestAdministration;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different values taken into account to calculate the current
 * collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralBalance" src="doc-files/CollateralBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
 * CollateralBalance.mmCollateralDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmHeldAmount
 * CollateralBalance.mmHeldAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmPriorAgreed
 * CollateralBalance.mmPriorAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmVariationMarginRelatedRiskCalculation
 * CollateralBalance.mmVariationMarginRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
 * CollateralBalance.mmInTransit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmSegregatedIndependentAmountRelatedRiskCalculation
 * CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmRelatedCollateralInterestManagement
 * CollateralBalance.mmRelatedCollateralInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralInterestManagement
 * CollateralBalance.mmCollateralInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
 * Collateral.mmCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
 * ExposureCalculation.mmCurrentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmClosingCollateralBalance
 * CollateralInterestAdministration.mmClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmOpeningCollateralBalance
 * CollateralInterestAdministration.mmOpeningCollateralBalance}</li>
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
 * "CollateralBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different values taken into account to calculate the current collateral."
 * </li>
 * </ul>
 */
public class CollateralBalance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Collateral> collateralDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the collateral included in the collateral balance,"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralBalance, List<Collateral>> mmCollateralDescription = new MMBusinessAssociationEnd<CollateralBalance, List<Collateral>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Describes the collateral included in the collateral balance,";
			minOccurs = 0;
			opposite_lazy = () -> Collateral.mmCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}

		@Override
		public List<Collateral> getValue(CollateralBalance obj) {
			return obj.getCollateralDescription();
		}

		@Override
		public void setValue(CollateralBalance obj, List<Collateral> value) {
			obj.setCollateralDescription(value);
		}
	};
	protected CurrencyAndAmount heldAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral currently held."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralBalance, CurrencyAndAmount> mmHeldAmount = new MMBusinessAttribute<CollateralBalance, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HeldAmount";
			definition = "Specifies the collateral currently held.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralBalance obj) {
			return obj.getHeldAmount();
		}

		@Override
		public void setValue(CollateralBalance obj, CurrencyAndAmount value) {
			obj.setHeldAmount(value);
		}
	};
	protected CurrencyAndAmount priorAgreed;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorAgreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which has been agreed but is not yet transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralBalance, CurrencyAndAmount> mmPriorAgreed = new MMBusinessAttribute<CollateralBalance, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorAgreed";
			definition = "Specifies the collateral which has been agreed but is not yet transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralBalance obj) {
			return obj.getPriorAgreed();
		}

		@Override
		public void setValue(CollateralBalance obj, CurrencyAndAmount value) {
			obj.setPriorAgreed(value);
		}
	};
	protected ExposureCalculation variationMarginRelatedRiskCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
	 * ExposureCalculation.mmCurrentVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk coverage for which a current variation margin is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralBalance, Optional<ExposureCalculation>> mmVariationMarginRelatedRiskCalculation = new MMBusinessAssociationEnd<CollateralBalance, Optional<ExposureCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedRiskCalculation";
			definition = "Risk coverage for which a current variation margin is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ExposureCalculation.mmCurrentVariationMargin;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}

		@Override
		public Optional<ExposureCalculation> getValue(CollateralBalance obj) {
			return obj.getVariationMarginRelatedRiskCalculation();
		}

		@Override
		public void setValue(CollateralBalance obj, Optional<ExposureCalculation> value) {
			obj.setVariationMarginRelatedRiskCalculation(value.orElse(null));
		}
	};
	protected CurrencyAndAmount inTransit;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral which is being transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralBalance, CurrencyAndAmount> mmInTransit = new MMBusinessAttribute<CollateralBalance, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InTransit";
			definition = "Specifies the collateral which is being transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralBalance obj) {
			return obj.getInTransit();
		}

		@Override
		public void setValue(CollateralBalance obj, CurrencyAndAmount value) {
			obj.setInTransit(value);
		}
	};
	protected ExposureCalculation segregatedIndependentAmountRelatedRiskCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
	 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Risk coverage for which a collateral balance is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralBalance, Optional<ExposureCalculation>> mmSegregatedIndependentAmountRelatedRiskCalculation = new MMBusinessAssociationEnd<CollateralBalance, Optional<ExposureCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedRiskCalculation";
			definition = "Risk coverage for which a collateral balance is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ExposureCalculation.mmCurrentSegregatedIndependentAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}

		@Override
		public Optional<ExposureCalculation> getValue(CollateralBalance obj) {
			return obj.getSegregatedIndependentAmountRelatedRiskCalculation();
		}

		@Override
		public void setValue(CollateralBalance obj, Optional<ExposureCalculation> value) {
			obj.setSegregatedIndependentAmountRelatedRiskCalculation(value.orElse(null));
		}
	};
	protected CollateralInterestAdministration relatedCollateralInterestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmOpeningCollateralBalance
	 * CollateralInterestAdministration.mmOpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which an opening balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralBalance, CollateralInterestAdministration> mmRelatedCollateralInterestManagement = new MMBusinessAssociationEnd<CollateralBalance, CollateralInterestAdministration>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralInterestManagement";
			definition = "Collateral interest management for which an opening balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralInterestAdministration.mmOpeningCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
		}

		@Override
		public CollateralInterestAdministration getValue(CollateralBalance obj) {
			return obj.getRelatedCollateralInterestManagement();
		}

		@Override
		public void setValue(CollateralBalance obj, CollateralInterestAdministration value) {
			obj.setRelatedCollateralInterestManagement(value);
		}
	};
	protected CollateralInterestAdministration collateralInterestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmClosingCollateralBalance
	 * CollateralInterestAdministration.mmClosingCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which a closing balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralBalance, CollateralInterestAdministration> mmCollateralInterestManagement = new MMBusinessAssociationEnd<CollateralBalance, CollateralInterestAdministration>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInterestManagement";
			definition = "Collateral interest management for which a closing balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralInterestAdministration.mmClosingCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
		}

		@Override
		public CollateralInterestAdministration getValue(CollateralBalance obj) {
			return obj.getCollateralInterestManagement();
		}

		@Override
		public void setValue(CollateralBalance obj, CollateralInterestAdministration value) {
			obj.setCollateralInterestManagement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralBalance";
				definition = "Specifies the different values taken into account to calculate the current collateral.";
				associationDomain_lazy = () -> Arrays.asList(Collateral.mmCollateralBalance, ExposureCalculation.mmCurrentVariationMargin, ExposureCalculation.mmCurrentSegregatedIndependentAmount,
						CollateralInterestAdministration.mmClosingCollateralBalance, CollateralInterestAdministration.mmOpeningCollateralBalance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralBalance.mmCollateralDescription, com.tools20022.repository.entity.CollateralBalance.mmHeldAmount,
						com.tools20022.repository.entity.CollateralBalance.mmPriorAgreed, com.tools20022.repository.entity.CollateralBalance.mmVariationMarginRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.mmInTransit, com.tools20022.repository.entity.CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.mmRelatedCollateralInterestManagement, com.tools20022.repository.entity.CollateralBalance.mmCollateralInterestManagement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralBalance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Collateral> getCollateralDescription() {
		return collateralDescription == null ? collateralDescription = new ArrayList<>() : collateralDescription;
	}

	public CollateralBalance setCollateralDescription(List<Collateral> collateralDescription) {
		this.collateralDescription = Objects.requireNonNull(collateralDescription);
		return this;
	}

	public CurrencyAndAmount getHeldAmount() {
		return heldAmount;
	}

	public CollateralBalance setHeldAmount(CurrencyAndAmount heldAmount) {
		this.heldAmount = Objects.requireNonNull(heldAmount);
		return this;
	}

	public CurrencyAndAmount getPriorAgreed() {
		return priorAgreed;
	}

	public CollateralBalance setPriorAgreed(CurrencyAndAmount priorAgreed) {
		this.priorAgreed = Objects.requireNonNull(priorAgreed);
		return this;
	}

	public Optional<ExposureCalculation> getVariationMarginRelatedRiskCalculation() {
		return variationMarginRelatedRiskCalculation == null ? Optional.empty() : Optional.of(variationMarginRelatedRiskCalculation);
	}

	public CollateralBalance setVariationMarginRelatedRiskCalculation(ExposureCalculation variationMarginRelatedRiskCalculation) {
		this.variationMarginRelatedRiskCalculation = variationMarginRelatedRiskCalculation;
		return this;
	}

	public CurrencyAndAmount getInTransit() {
		return inTransit;
	}

	public CollateralBalance setInTransit(CurrencyAndAmount inTransit) {
		this.inTransit = Objects.requireNonNull(inTransit);
		return this;
	}

	public Optional<ExposureCalculation> getSegregatedIndependentAmountRelatedRiskCalculation() {
		return segregatedIndependentAmountRelatedRiskCalculation == null ? Optional.empty() : Optional.of(segregatedIndependentAmountRelatedRiskCalculation);
	}

	public CollateralBalance setSegregatedIndependentAmountRelatedRiskCalculation(ExposureCalculation segregatedIndependentAmountRelatedRiskCalculation) {
		this.segregatedIndependentAmountRelatedRiskCalculation = segregatedIndependentAmountRelatedRiskCalculation;
		return this;
	}

	public CollateralInterestAdministration getRelatedCollateralInterestManagement() {
		return relatedCollateralInterestManagement;
	}

	public CollateralBalance setRelatedCollateralInterestManagement(CollateralInterestAdministration relatedCollateralInterestManagement) {
		this.relatedCollateralInterestManagement = Objects.requireNonNull(relatedCollateralInterestManagement);
		return this;
	}

	public CollateralInterestAdministration getCollateralInterestManagement() {
		return collateralInterestManagement;
	}

	public CollateralBalance setCollateralInterestManagement(CollateralInterestAdministration collateralInterestManagement) {
		this.collateralInterestManagement = Objects.requireNonNull(collateralInterestManagement);
		return this;
	}
}