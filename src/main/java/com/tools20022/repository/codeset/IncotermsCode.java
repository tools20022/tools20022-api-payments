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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.IncotermsCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A set of international standard trade terms (delivery terms) used to
 * designate a point at which the costs and risks of transport are divided
 * between the buyer and the seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IncotermsCode#ExWorks
 * IncotermsCode.ExWorks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IncotermsCode#FreeCarrier
 * IncotermsCode.FreeCarrier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#FreeAlongsideShip
 * IncotermsCode.FreeAlongsideShip}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IncotermsCode#FreeOnBoard
 * IncotermsCode.FreeOnBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#CostAndFreight
 * IncotermsCode.CostAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#CostInsuranceAndFreight
 * IncotermsCode.CostInsuranceAndFreight}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IncotermsCode#CarriagePaid
 * IncotermsCode.CarriagePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#CarriageAndInsurancePaid
 * IncotermsCode.CarriageAndInsurancePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#DeliveredAtFrontier
 * IncotermsCode.DeliveredAtFrontier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#DeliveredExShip
 * IncotermsCode.DeliveredExShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#DeliveredExQuay
 * IncotermsCode.DeliveredExQuay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#DeliveredDutyUnpaid
 * IncotermsCode.DeliveredDutyUnpaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode#DeliveredDutyPaid
 * IncotermsCode.DeliveredDutyPaid}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IncotermsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IncotermsCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ex Works (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWorks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ex Works (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode ExWorks = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExWorks";
			definition = "Ex Works (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "EXW";
		}
	};
	/**
	 * Free Carrier (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCarrier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free Carrier (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode FreeCarrier = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeCarrier";
			definition = "Free Carrier (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "FCA";
		}
	};
	/**
	 * Free Alongside Ship (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeAlongsideShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free Alongside Ship (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode FreeAlongsideShip = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeAlongsideShip";
			definition = "Free Alongside Ship (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "FAS";
		}
	};
	/**
	 * Free On Board (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeOnBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free On Board (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode FreeOnBoard = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeOnBoard";
			definition = "Free On Board (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "FOB";
		}
	};
	/**
	 * Cost and Freight (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAndFreight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost and Freight (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode CostAndFreight = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostAndFreight";
			definition = "Cost and Freight (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "CFR";
		}
	};
	/**
	 * Cost, Insurance and Freight (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostInsuranceAndFreight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cost, Insurance and Freight (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode CostInsuranceAndFreight = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CostInsuranceAndFreight";
			definition = "Cost, Insurance and Freight (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "CIF";
		}
	};
	/**
	 * Carriage Paid To (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriagePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Carriage Paid To (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode CarriagePaid = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarriagePaid";
			definition = "Carriage Paid To (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "CPT";
		}
	};
	/**
	 * Carriage and Insurance Paid to (any mode of transport, including
	 * multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriageAndInsurancePaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Carriage and Insurance Paid to (any mode of transport, including multimodal)."
	 * </li>
	 * </ul>
	 */
	public static final IncotermsCode CarriageAndInsurancePaid = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarriageAndInsurancePaid";
			definition = "Carriage and Insurance Paid to (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "CIP";
		}
	};
	/**
	 * Delivered At Frontier (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredAtFrontier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered At Frontier (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode DeliveredAtFrontier = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredAtFrontier";
			definition = "Delivered At Frontier (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "DAF";
		}
	};
	/**
	 * Delivered Ex Ship (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivered Ex Ship (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode DeliveredExShip = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredExShip";
			definition = "Delivered Ex Ship (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "DES";
		}
	};
	/**
	 * Delivered Ex Quay (sea and inland waterway transport).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExQuay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivered Ex Quay (sea and inland waterway transport)."</li>
	 * </ul>
	 */
	public static final IncotermsCode DeliveredExQuay = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredExQuay";
			definition = "Delivered Ex Quay (sea and inland waterway transport).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "DEQ";
		}
	};
	/**
	 * Delivered Duty Unpaid (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyUnpaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered Duty Unpaid (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode DeliveredDutyUnpaid = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyUnpaid";
			definition = "Delivered Duty Unpaid (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "DDU";
		}
	};
	/**
	 * Delivered Duty Paid (any mode of transport, including multimodal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivered Duty Paid (any mode of transport, including multimodal)."</li>
	 * </ul>
	 */
	public static final IncotermsCode DeliveredDutyPaid = new IncotermsCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveredDutyPaid";
			definition = "Delivered Duty Paid (any mode of transport, including multimodal).";
			owner_lazy = () -> com.tools20022.repository.codeset.IncotermsCode.mmObject();
			codeName = "DDP";
		}
	};
	final static private LinkedHashMap<String, IncotermsCode> codesByName = new LinkedHashMap<>();

	protected IncotermsCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncotermsCode";
				definition = "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IncotermsCode.ExWorks, com.tools20022.repository.codeset.IncotermsCode.FreeCarrier, com.tools20022.repository.codeset.IncotermsCode.FreeAlongsideShip,
						com.tools20022.repository.codeset.IncotermsCode.FreeOnBoard, com.tools20022.repository.codeset.IncotermsCode.CostAndFreight, com.tools20022.repository.codeset.IncotermsCode.CostInsuranceAndFreight,
						com.tools20022.repository.codeset.IncotermsCode.CarriagePaid, com.tools20022.repository.codeset.IncotermsCode.CarriageAndInsurancePaid, com.tools20022.repository.codeset.IncotermsCode.DeliveredAtFrontier,
						com.tools20022.repository.codeset.IncotermsCode.DeliveredExShip, com.tools20022.repository.codeset.IncotermsCode.DeliveredExQuay, com.tools20022.repository.codeset.IncotermsCode.DeliveredDutyUnpaid,
						com.tools20022.repository.codeset.IncotermsCode.DeliveredDutyPaid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExWorks.getCodeName().get(), ExWorks);
		codesByName.put(FreeCarrier.getCodeName().get(), FreeCarrier);
		codesByName.put(FreeAlongsideShip.getCodeName().get(), FreeAlongsideShip);
		codesByName.put(FreeOnBoard.getCodeName().get(), FreeOnBoard);
		codesByName.put(CostAndFreight.getCodeName().get(), CostAndFreight);
		codesByName.put(CostInsuranceAndFreight.getCodeName().get(), CostInsuranceAndFreight);
		codesByName.put(CarriagePaid.getCodeName().get(), CarriagePaid);
		codesByName.put(CarriageAndInsurancePaid.getCodeName().get(), CarriageAndInsurancePaid);
		codesByName.put(DeliveredAtFrontier.getCodeName().get(), DeliveredAtFrontier);
		codesByName.put(DeliveredExShip.getCodeName().get(), DeliveredExShip);
		codesByName.put(DeliveredExQuay.getCodeName().get(), DeliveredExQuay);
		codesByName.put(DeliveredDutyUnpaid.getCodeName().get(), DeliveredDutyUnpaid);
		codesByName.put(DeliveredDutyPaid.getCodeName().get(), DeliveredDutyPaid);
	}

	public static IncotermsCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IncotermsCode[] values() {
		IncotermsCode[] values = new IncotermsCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IncotermsCode> {
		@Override
		public IncotermsCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IncotermsCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}