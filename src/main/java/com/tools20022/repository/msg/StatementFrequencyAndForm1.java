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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CommunicationFormat1Choice;
import com.tools20022.repository.choice.CommunicationMethod2Choice;
import com.tools20022.repository.codeset.Frequency7Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a frequency, format and delivery address for statements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFrequency
 * StatementFrequencyAndForm1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmCommunicationMethod
 * StatementFrequencyAndForm1.mmCommunicationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmDeliveryAddress
 * StatementFrequencyAndForm1.mmDeliveryAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFormat
 * StatementFrequencyAndForm1.mmFormat}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
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
 * "StatementFrequencyAndForm1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a frequency, format and delivery address for statements."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatementFrequencyAndForm1", propOrder = {"frequency", "communicationMethod", "deliveryAddress", "format"})
public class StatementFrequencyAndForm1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Frequency7Code frequency;
	/**
	 * Specifies the frequency for sending statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency7Code
	 * Frequency7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency for sending statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Specifies the frequency for sending statements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency7Code.mmObject();
		}
	};
	protected CommunicationMethod2Choice communicationMethod;
	/**
	 * Specifies the communication method for statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod2Choice
	 * CommunicationMethod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
	 * ReportingService.mmReportingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the communication method for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommunicationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmReportingChannel;
			componentContext_lazy = () -> StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "ComMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationMethod";
			definition = "Specifies the communication method for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CommunicationMethod2Choice.mmObject();
		}
	};
	protected Max350Text deliveryAddress;
	/**
	 * Specifies the delivery address for statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery address for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "DlvryAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAddress";
			definition = "Specifies the delivery address for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CommunicationFormat1Choice format;
	/**
	 * Specifies the format for statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationFormat1Choice
	 * CommunicationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the format for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Specifies the format for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CommunicationFormat1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmFrequency, StatementFrequencyAndForm1.mmCommunicationMethod, StatementFrequencyAndForm1.mmDeliveryAddress, StatementFrequencyAndForm1.mmFormat);
				trace_lazy = () -> ReportingService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementFrequencyAndForm1";
				definition = "Specifies a frequency, format and delivery address for statements.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Frqcy", required = true)
	public Frequency7Code getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency7Code frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "ComMtd", required = true)
	public CommunicationMethod2Choice getCommunicationMethod() {
		return communicationMethod;
	}

	public void setCommunicationMethod(CommunicationMethod2Choice communicationMethod) {
		this.communicationMethod = communicationMethod;
	}

	@XmlElement(name = "DlvryAdr", required = true)
	public Max350Text getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Max350Text deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@XmlElement(name = "Frmt", required = true)
	public CommunicationFormat1Choice getFormat() {
		return format;
	}

	public void setFormat(CommunicationFormat1Choice format) {
		this.format = format;
	}
}