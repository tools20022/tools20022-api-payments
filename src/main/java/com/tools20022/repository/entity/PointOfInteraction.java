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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PointOfInteraction1;
import com.tools20022.repository.msg.PointOfInteractionCapabilities1;
import com.tools20022.repository.msg.PointOfInteractionComponent1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Point of interaction (POI) is the entry point to a card payment system. It
 * could be a physical or logical card payment terminal containing software and
 * hardware components, it could be a payment system including a set of card
 * payment terminals linked to a local or remote server, or it could be just an
 * interface to make payments as telephone or Internet browser.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PointOfInteraction" src="doc-files/PointOfInteraction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
 * PointOfInteraction.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
 * PointOfInteraction.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmOnLineCapabilities
 * PointOfInteraction.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmDisplayCapabilities
 * PointOfInteraction.mmDisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmPrintLineWidth
 * PointOfInteraction.mmPrintLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
 * PointOfInteraction.mmComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponentIdentification
 * PointOfInteraction.mmComponentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmGroupIdentifier
 * PointOfInteraction.mmGroupIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmLineWidth
 * PointOfInteraction.mmLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmNumberOfLines
 * PointOfInteraction.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmErrorLog
 * PointOfInteraction.mmErrorLog}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponentVersionNumber
 * PointOfInteraction.mmComponentVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmControllingTerminalManagementSystem
 * PointOfInteraction.mmControllingTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
 * CardPaymentAcquiring.mmPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmControlledPointOfInteraction
 * TerminalManagementSystem.mmControlledPointOfInteraction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction1#mmCapabilities
 * PointOfInteraction1.mmCapabilities}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
 * PointOfInteractionCapabilities1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1
 * PointOfInteractionComponent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction1
 * PointOfInteraction1}</li>
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
 * "PointOfInteraction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser."
 * </li>
 * </ul>
 */
public class PointOfInteraction extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentAcquiring cardPaymentAcquiring;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process which uses the point of interaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PointOfInteraction, Optional<CardPaymentAcquiring>> mmCardPaymentAcquiring = new MMBusinessAssociationEnd<PointOfInteraction, Optional<CardPaymentAcquiring>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process which uses the point of interaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}

		@Override
		public Optional<CardPaymentAcquiring> getValue(PointOfInteraction obj) {
			return obj.getCardPaymentAcquiring();
		}

		@Override
		public void setValue(PointOfInteraction obj, Optional<CardPaymentAcquiring> value) {
			obj.setCardPaymentAcquiring(value.orElse(null));
		}
	};
	protected CardDataReadingCode cardReadingCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities1.mmCardReadingCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the POI performing the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, CardDataReadingCode> mmCardReadingCapabilities = new MMBusinessAttribute<PointOfInteraction, CardDataReadingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmCardReadingCapabilities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI performing the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}

		@Override
		public CardDataReadingCode getValue(PointOfInteraction obj) {
			return obj.getCardReadingCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction obj, CardDataReadingCode value) {
			obj.setCardReadingCapabilities(value);
		}
	};
	protected CardholderVerificationCapabilityCode cardholderVerificationCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapabilityCode
	 * CardholderVerificationCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities1.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderVerificationCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of cardholder verification that could be performed during a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, CardholderVerificationCapabilityCode> mmCardholderVerificationCapabilities = new MMBusinessAttribute<PointOfInteraction, CardholderVerificationCapabilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmCardholderVerificationCapabilities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Type of cardholder verification that could be performed during a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
		}

		@Override
		public CardholderVerificationCapabilityCode getValue(PointOfInteraction obj) {
			return obj.getCardholderVerificationCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction obj, CardholderVerificationCapabilityCode value) {
			obj.setCardholderVerificationCapabilities(value);
		}
	};
	protected OnLineCapabilityCode onLineCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmOnLineCapabilities
	 * PointOfInteractionCapabilities1.mmOnLineCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line and off-line capabilities of the POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, OnLineCapabilityCode> mmOnLineCapabilities = new MMBusinessAttribute<PointOfInteraction, OnLineCapabilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmOnLineCapabilities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineCapabilityCode.mmObject();
		}

		@Override
		public OnLineCapabilityCode getValue(PointOfInteraction obj) {
			return obj.getOnLineCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction obj, OnLineCapabilityCode value) {
			obj.setOnLineCapabilities(value);
		}
	};
	protected UserInterfaceCode displayCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmDisplayCapabilities
	 * PointOfInteractionCapabilities1.mmDisplayCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Display interfaces components."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, UserInterfaceCode> mmDisplayCapabilities = new MMBusinessAttribute<PointOfInteraction, UserInterfaceCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmDisplayCapabilities);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisplayCapabilities";
			definition = "Display interfaces components.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterfaceCode.mmObject();
		}

		@Override
		public UserInterfaceCode getValue(PointOfInteraction obj) {
			return obj.getDisplayCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction obj, UserInterfaceCode value) {
			obj.setDisplayCapabilities(value);
		}
	};
	protected Max3NumericText printLineWidth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmPrintLineWidth
	 * PointOfInteractionCapabilities1.mmPrintLineWidth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the printer component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max3NumericText> mmPrintLineWidth = new MMBusinessAttribute<PointOfInteraction, Max3NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmPrintLineWidth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Max3NumericText getValue(PointOfInteraction obj) {
			return obj.getPrintLineWidth();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max3NumericText value) {
			obj.setPrintLineWidth(value);
		}
	};
	protected POIComponentTypeCode component;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction1#mmComponent
	 * PointOfInteraction1.mmComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of components belonging to a POI."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, POIComponentTypeCode> mmComponent = new MMBusinessAttribute<PointOfInteraction, POIComponentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteraction1.mmComponent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Component";
			definition = "Type of components belonging to a POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentTypeCode.mmObject();
		}

		@Override
		public POIComponentTypeCode getValue(PointOfInteraction obj) {
			return obj.getComponent();
		}

		@Override
		public void setValue(PointOfInteraction obj, POIComponentTypeCode value) {
			obj.setComponent(value);
		}
	};
	protected Max35Text componentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI component assigned by its provider."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max35Text> mmComponentIdentification = new MMBusinessAttribute<PointOfInteraction, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentIdentification";
			definition = "Identification of the POI component assigned by its provider.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteraction obj) {
			return obj.getComponentIdentification();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max35Text value) {
			obj.setComponentIdentification(value);
		}
	};
	protected Max35Text groupIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max35Text> mmGroupIdentifier = new MMBusinessAttribute<PointOfInteraction, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GroupIdentifier";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteraction obj) {
			return obj.getGroupIdentifier();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max35Text value) {
			obj.setGroupIdentifier(value);
		}
	};
	protected Max3NumericText lineWidth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max3NumericText> mmLineWidth = new MMBusinessAttribute<PointOfInteraction, Max3NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Max3NumericText getValue(PointOfInteraction obj) {
			return obj.getLineWidth();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max3NumericText value) {
			obj.setLineWidth(value);
		}
	};
	protected Max2NumericText numberOfLines;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max2NumericText> mmNumberOfLines = new MMBusinessAttribute<PointOfInteraction, Max2NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}

		@Override
		public Max2NumericText getValue(PointOfInteraction obj) {
			return obj.getNumberOfLines();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max2NumericText value) {
			obj.setNumberOfLines(value);
		}
	};
	protected Max140Text errorLog;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorLog"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Error logging transferred by the point of interaction to the terminal management system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max140Text> mmErrorLog = new MMBusinessAttribute<PointOfInteraction, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ErrorLog";
			definition = "Error logging transferred by the point of interaction to the terminal management system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PointOfInteraction obj) {
			return obj.getErrorLog();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max140Text value) {
			obj.setErrorLog(value);
		}
	};
	protected Max16Text componentVersionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a version of component belonging to a given model."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PointOfInteraction, Max16Text> mmComponentVersionNumber = new MMBusinessAttribute<PointOfInteraction, Max16Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComponentVersionNumber";
			definition = "Identification of a version of component belonging to a given model.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(PointOfInteraction obj) {
			return obj.getComponentVersionNumber();
		}

		@Override
		public void setValue(PointOfInteraction obj, Max16Text value) {
			obj.setComponentVersionNumber(value);
		}
	};
	protected TerminalManagementSystem controllingTerminalManagementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmControlledPointOfInteraction
	 * TerminalManagementSystem.mmControlledPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControllingTerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which a point of interaction is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PointOfInteraction, Optional<TerminalManagementSystem>> mmControllingTerminalManagementSystem = new MMBusinessAssociationEnd<PointOfInteraction, Optional<TerminalManagementSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ControllingTerminalManagementSystem";
			definition = "Terminal management system for which a point of interaction is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TerminalManagementSystem.mmControlledPointOfInteraction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}

		@Override
		public Optional<TerminalManagementSystem> getValue(PointOfInteraction obj) {
			return obj.getControllingTerminalManagementSystem();
		}

		@Override
		public void setValue(PointOfInteraction obj, Optional<TerminalManagementSystem> value) {
			obj.setControllingTerminalManagementSystem(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction";
				definition = "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction, TerminalManagementSystem.mmControlledPointOfInteraction);
				derivationElement_lazy = () -> Arrays.asList(PointOfInteraction1.mmCapabilities);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PointOfInteraction.mmCardPaymentAcquiring, com.tools20022.repository.entity.PointOfInteraction.mmCardReadingCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.mmCardholderVerificationCapabilities, com.tools20022.repository.entity.PointOfInteraction.mmOnLineCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.mmDisplayCapabilities, com.tools20022.repository.entity.PointOfInteraction.mmPrintLineWidth, com.tools20022.repository.entity.PointOfInteraction.mmComponent,
						com.tools20022.repository.entity.PointOfInteraction.mmComponentIdentification, com.tools20022.repository.entity.PointOfInteraction.mmGroupIdentifier, com.tools20022.repository.entity.PointOfInteraction.mmLineWidth,
						com.tools20022.repository.entity.PointOfInteraction.mmNumberOfLines, com.tools20022.repository.entity.PointOfInteraction.mmErrorLog, com.tools20022.repository.entity.PointOfInteraction.mmComponentVersionNumber,
						com.tools20022.repository.entity.PointOfInteraction.mmControllingTerminalManagementSystem);
				derivationComponent_lazy = () -> Arrays.asList(PointOfInteractionCapabilities1.mmObject(), PointOfInteractionComponent1.mmObject(), PointOfInteraction1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PointOfInteraction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardPaymentAcquiring> getCardPaymentAcquiring() {
		return cardPaymentAcquiring == null ? Optional.empty() : Optional.of(cardPaymentAcquiring);
	}

	public PointOfInteraction setCardPaymentAcquiring(com.tools20022.repository.entity.CardPaymentAcquiring cardPaymentAcquiring) {
		this.cardPaymentAcquiring = cardPaymentAcquiring;
		return this;
	}

	public CardDataReadingCode getCardReadingCapabilities() {
		return cardReadingCapabilities;
	}

	public PointOfInteraction setCardReadingCapabilities(CardDataReadingCode cardReadingCapabilities) {
		this.cardReadingCapabilities = Objects.requireNonNull(cardReadingCapabilities);
		return this;
	}

	public CardholderVerificationCapabilityCode getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities;
	}

	public PointOfInteraction setCardholderVerificationCapabilities(CardholderVerificationCapabilityCode cardholderVerificationCapabilities) {
		this.cardholderVerificationCapabilities = Objects.requireNonNull(cardholderVerificationCapabilities);
		return this;
	}

	public OnLineCapabilityCode getOnLineCapabilities() {
		return onLineCapabilities;
	}

	public PointOfInteraction setOnLineCapabilities(OnLineCapabilityCode onLineCapabilities) {
		this.onLineCapabilities = Objects.requireNonNull(onLineCapabilities);
		return this;
	}

	public UserInterfaceCode getDisplayCapabilities() {
		return displayCapabilities;
	}

	public PointOfInteraction setDisplayCapabilities(UserInterfaceCode displayCapabilities) {
		this.displayCapabilities = Objects.requireNonNull(displayCapabilities);
		return this;
	}

	public Max3NumericText getPrintLineWidth() {
		return printLineWidth;
	}

	public PointOfInteraction setPrintLineWidth(Max3NumericText printLineWidth) {
		this.printLineWidth = Objects.requireNonNull(printLineWidth);
		return this;
	}

	public POIComponentTypeCode getComponent() {
		return component;
	}

	public PointOfInteraction setComponent(POIComponentTypeCode component) {
		this.component = Objects.requireNonNull(component);
		return this;
	}

	public Max35Text getComponentIdentification() {
		return componentIdentification;
	}

	public PointOfInteraction setComponentIdentification(Max35Text componentIdentification) {
		this.componentIdentification = Objects.requireNonNull(componentIdentification);
		return this;
	}

	public Max35Text getGroupIdentifier() {
		return groupIdentifier;
	}

	public PointOfInteraction setGroupIdentifier(Max35Text groupIdentifier) {
		this.groupIdentifier = Objects.requireNonNull(groupIdentifier);
		return this;
	}

	public Max3NumericText getLineWidth() {
		return lineWidth;
	}

	public PointOfInteraction setLineWidth(Max3NumericText lineWidth) {
		this.lineWidth = Objects.requireNonNull(lineWidth);
		return this;
	}

	public Max2NumericText getNumberOfLines() {
		return numberOfLines;
	}

	public PointOfInteraction setNumberOfLines(Max2NumericText numberOfLines) {
		this.numberOfLines = Objects.requireNonNull(numberOfLines);
		return this;
	}

	public Max140Text getErrorLog() {
		return errorLog;
	}

	public PointOfInteraction setErrorLog(Max140Text errorLog) {
		this.errorLog = Objects.requireNonNull(errorLog);
		return this;
	}

	public Max16Text getComponentVersionNumber() {
		return componentVersionNumber;
	}

	public PointOfInteraction setComponentVersionNumber(Max16Text componentVersionNumber) {
		this.componentVersionNumber = Objects.requireNonNull(componentVersionNumber);
		return this;
	}

	public Optional<TerminalManagementSystem> getControllingTerminalManagementSystem() {
		return controllingTerminalManagementSystem == null ? Optional.empty() : Optional.of(controllingTerminalManagementSystem);
	}

	public PointOfInteraction setControllingTerminalManagementSystem(TerminalManagementSystem controllingTerminalManagementSystem) {
		this.controllingTerminalManagementSystem = controllingTerminalManagementSystem;
		return this;
	}
}