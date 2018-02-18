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
import com.tools20022.repository.codeset.OffsetTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of peg offset or type of discretion offset (e.g. price offset, tick
 * offset etc).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OffsetTypeCode#Price
 * OffsetTypeCode.Price}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OffsetTypeCode#BasisPoint
 * OffsetTypeCode.BasisPoint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OffsetTypeCode#Tick
 * OffsetTypeCode.Tick}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode#PriceTierLevel
 * OffsetTypeCode.PriceTierLevel}</li>
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
 * <li>"PRIC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OffsetTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of peg offset or type of discretion offset (e.g. price offset, tick offset etc)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OffsetTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that range of peg order or discretion offset value is a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that range of peg order or discretion offset value is a price."
	 * </li>
	 * </ul>
	 */
	public static final OffsetTypeCode Price = new OffsetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates that range of peg order or discretion offset value is a price.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffsetTypeCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * The range of peg order or discretion offset value is measured in basis
	 * points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The range of peg order or discretion offset value is measured in basis points."
	 * </li>
	 * </ul>
	 */
	public static final OffsetTypeCode BasisPoint = new OffsetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPoint";
			definition = "The range of peg order or discretion offset value is measured in basis points.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffsetTypeCode.mmObject();
			codeName = "BAPO";
		}
	};
	/**
	 * The range of peg order or discretion offset value is a tick.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The range of peg order or discretion offset value is a tick."</li>
	 * </ul>
	 */
	public static final OffsetTypeCode Tick = new OffsetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tick";
			definition = "The range of peg order or discretion offset value is a tick.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffsetTypeCode.mmObject();
			codeName = "TICK";
		}
	};
	/**
	 * The range of peg order or discretion offset is a price level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTierLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The range of peg order or discretion offset is a price level."</li>
	 * </ul>
	 */
	public static final OffsetTypeCode PriceTierLevel = new OffsetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTierLevel";
			definition = "The range of peg order or discretion offset is a price level.";
			owner_lazy = () -> com.tools20022.repository.codeset.OffsetTypeCode.mmObject();
			codeName = "PTLE";
		}
	};
	final static private LinkedHashMap<String, OffsetTypeCode> codesByName = new LinkedHashMap<>();

	protected OffsetTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OffsetTypeCode";
				definition = "Type of peg offset or type of discretion offset (e.g. price offset, tick offset etc).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OffsetTypeCode.Price, com.tools20022.repository.codeset.OffsetTypeCode.BasisPoint, com.tools20022.repository.codeset.OffsetTypeCode.Tick,
						com.tools20022.repository.codeset.OffsetTypeCode.PriceTierLevel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Price.getCodeName().get(), Price);
		codesByName.put(BasisPoint.getCodeName().get(), BasisPoint);
		codesByName.put(Tick.getCodeName().get(), Tick);
		codesByName.put(PriceTierLevel.getCodeName().get(), PriceTierLevel);
	}

	public static OffsetTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OffsetTypeCode[] values() {
		OffsetTypeCode[] values = new OffsetTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OffsetTypeCode> {
		@Override
		public OffsetTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OffsetTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}